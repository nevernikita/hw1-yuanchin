

/* First created by JCasGen Wed Sep 11 21:16:56 EDT 2013 */
package edu.cmu.cs.hw1.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** Annotate 1-, 2- and 3-grams of consecutive tokens.
 * Updated by JCasGen Wed Sep 11 21:16:56 EDT 2013
 * XML source: F:/eclipse/hw1-yuanchin/src/main/resources/hw1-yuanchin-typesystem.xml
 * @generated */
public class NGram extends AnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets Record consecutive tokens in NGram.
   * @generated */
  public FSArray getElements() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "edu.cmu.cs.hw1.model.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets Record consecutive tokens in NGram. 
   * @generated */
  public void setElements(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "edu.cmu.cs.hw1.model.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elements - gets an indexed value - Record consecutive tokens in NGram.
   * @generated */
  public Token getElements(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "edu.cmu.cs.hw1.model.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements), i)));}

  /** indexed setter for elements - sets an indexed value - Record consecutive tokens in NGram.
   * @generated */
  public void setElements(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "edu.cmu.cs.hw1.model.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_elements), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: elementType

  /** getter for elementType - gets Indicate the element type in NGram.
   * @generated */
  public String getElementType() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "edu.cmu.cs.hw1.model.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_elementType);}
    
  /** setter for elementType - sets Indicate the element type in NGram. 
   * @generated */
  public void setElementType(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "edu.cmu.cs.hw1.model.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_elementType, v);}    
  }

    