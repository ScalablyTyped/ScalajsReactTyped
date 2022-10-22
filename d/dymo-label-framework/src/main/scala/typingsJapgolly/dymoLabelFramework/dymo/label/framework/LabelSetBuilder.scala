package typingsJapgolly.dymoLabelFramework.dymo.label.framework

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LabelSetBuilder is used to create a LabelSet to print multiple labels in one print job.
  * LabelSet is a collection of records. Each record contains multiple pairs; each pair consists
  * of the object name and the object text data/content. The data of each record are applied to all
  * corresponend objects and for each record one label is printed.
  */
trait LabelSetBuilder extends StObject {
  
  /**
    * Adds a new record to the LabelSet. Returns a record object.
    */
  def addRecord(): ILabelSetRecord
  
  /**
    * Get all record objects in this LabelSetBuilder.
    */
  def getRecords(): js.Array[ILabelSetRecord]
}
object LabelSetBuilder {
  
  inline def apply(addRecord: CallbackTo[ILabelSetRecord], getRecords: CallbackTo[js.Array[ILabelSetRecord]]): LabelSetBuilder = {
    val __obj = js.Dynamic.literal(addRecord = addRecord.toJsFn, getRecords = getRecords.toJsFn)
    __obj.asInstanceOf[LabelSetBuilder]
  }
  
  extension [Self <: LabelSetBuilder](x: Self) {
    
    inline def setAddRecord(value: CallbackTo[ILabelSetRecord]): Self = StObject.set(x, "addRecord", value.toJsFn)
    
    inline def setGetRecords(value: CallbackTo[js.Array[ILabelSetRecord]]): Self = StObject.set(x, "getRecords", value.toJsFn)
  }
}
