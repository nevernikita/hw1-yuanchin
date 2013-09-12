

/* First created by JCasGen Wed Sep 11 21:16:56 EDT 2013 */
package edu.cmu.cs.hw1.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A basic type of annotation extends the type Annotation, which contains attributes "begin", "end"£¬ "confidence" and "casProcessorId".
 * Updated by JCasGen Wed Sep 11 21:16:56 EDT 2013
 * XML source: F:/eclipse/hw1-yuanchin/src/main/resources/hw1-yuanchin-typesystem.xml
 * @generated */
public class AnnotationType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationType.class);
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
  protected AnnotationType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnnotationType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnnotationType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnnotationType(JCas jcas, int begin, int end) {
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
  //* Feature: confidence

  /** getter for confidence - gets Record the confidence score assigned.
   * @generated */
  public double getConfidence() {
    if (AnnotationType_Type.featOkTst && ((AnnotationType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.cs.hw1.model.AnnotationType");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnnotationType_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Record the confidence score assigned. 
   * @generated */
  public void setConfidence(double v) {
    if (AnnotationType_Type.featOkTst && ((AnnotationType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.cs.hw1.model.AnnotationType");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnnotationType_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets Record the name of the component that produce the annotation.
   * @generated */
  public String getCasProcessorId() {
    if (AnnotationType_Type.featOkTst && ((AnnotationType_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "edu.cmu.cs.hw1.model.AnnotationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationType_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets Record the name of the component that produce the annotation. 
   * @generated */
  public void setCasProcessorId(String v) {
    if (AnnotationType_Type.featOkTst && ((AnnotationType_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "edu.cmu.cs.hw1.model.AnnotationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationType_Type)jcasType).casFeatCode_casProcessorId, v);}    
  }

    