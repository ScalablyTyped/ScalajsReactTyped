package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignaturesCollection extends StObject {
  
  val Count: Double
  
  def Create(): SignatureObject
  
  /* private */ @JSName("InfoPath.SignaturesCollection_typekey")
  var InfoPathDotSignaturesCollection_typekey: SignaturesCollection
  
  def Item(varIndex: Any): SignatureObject
}
object SignaturesCollection {
  
  inline def apply(
    Count: Double,
    Create: CallbackTo[SignatureObject],
    InfoPathDotSignaturesCollection_typekey: SignaturesCollection,
    Item: Any => SignatureObject
  ): SignaturesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Create = Create.toJsFn, Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignaturesCollection_typekey")(InfoPathDotSignaturesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturesCollection]
  }
  
  extension [Self <: SignaturesCollection](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: CallbackTo[SignatureObject]): Self = StObject.set(x, "Create", value.toJsFn)
    
    inline def setInfoPathDotSignaturesCollection_typekey(value: SignaturesCollection): Self = StObject.set(x, "InfoPath.SignaturesCollection_typekey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => SignatureObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
