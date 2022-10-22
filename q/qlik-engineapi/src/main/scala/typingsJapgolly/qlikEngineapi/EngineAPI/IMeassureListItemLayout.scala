package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionsListProperties width extend GenericBaseLayout
  */
trait IMeassureListItemLayout
  extends StObject
     with IGenericBaseLayout {
  
  var qData: Null
  
  @JSName("qMeta")
  var qMeta_IMeassureListItemLayout: INxMetaTitleDescriptionTag
}
object IMeassureListItemLayout {
  
  inline def apply(qData: Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IMeassureListItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeassureListItemLayout]
  }
  
  extension [Self <: IMeassureListItemLayout](x: Self) {
    
    inline def setQData(value: Null): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQMeta(value: INxMetaTitleDescriptionTag): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
