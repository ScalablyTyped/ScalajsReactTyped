package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxLibraryDimensionDef
  */
trait INxLibraryDimensionDef extends StObject {
  
  /**
    * Array of dimension names.
    */
  var qFieldDefs: js.Array[String]
  
  /**
    * Array of dimension labels.
    */
  var qFieldLabels: js.Array[String]
  
  /**
    * Information about the grouping.
    */
  var qGrouping: NxGrpType
  
  /**
    * no docu
    */
  var qLabelExpression: String
}
object INxLibraryDimensionDef {
  
  inline def apply(
    qFieldDefs: js.Array[String],
    qFieldLabels: js.Array[String],
    qGrouping: NxGrpType,
    qLabelExpression: String
  ): INxLibraryDimensionDef = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qFieldLabels = qFieldLabels.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qLabelExpression = qLabelExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLibraryDimensionDef]
  }
  
  extension [Self <: INxLibraryDimensionDef](x: Self) {
    
    inline def setQFieldDefs(value: js.Array[String]): Self = StObject.set(x, "qFieldDefs", value.asInstanceOf[js.Any])
    
    inline def setQFieldDefsVarargs(value: String*): Self = StObject.set(x, "qFieldDefs", js.Array(value*))
    
    inline def setQFieldLabels(value: js.Array[String]): Self = StObject.set(x, "qFieldLabels", value.asInstanceOf[js.Any])
    
    inline def setQFieldLabelsVarargs(value: String*): Self = StObject.set(x, "qFieldLabels", js.Array(value*))
    
    inline def setQGrouping(value: NxGrpType): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    inline def setQLabelExpression(value: String): Self = StObject.set(x, "qLabelExpression", value.asInstanceOf[js.Any])
  }
}
