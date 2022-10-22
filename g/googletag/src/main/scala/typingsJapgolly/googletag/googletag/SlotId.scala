package typingsJapgolly.googletag.googletag

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object of slot id information.
  */
trait SlotId extends StObject {
  
  def getAdUnitPath(): String
  
  def getDomId(): String
  
  def getId(): String
  
  def getName(): String
}
object SlotId {
  
  inline def apply(
    getAdUnitPath: CallbackTo[String],
    getDomId: CallbackTo[String],
    getId: CallbackTo[String],
    getName: CallbackTo[String]
  ): SlotId = {
    val __obj = js.Dynamic.literal(getAdUnitPath = getAdUnitPath.toJsFn, getDomId = getDomId.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn)
    __obj.asInstanceOf[SlotId]
  }
  
  extension [Self <: SlotId](x: Self) {
    
    inline def setGetAdUnitPath(value: CallbackTo[String]): Self = StObject.set(x, "getAdUnitPath", value.toJsFn)
    
    inline def setGetDomId(value: CallbackTo[String]): Self = StObject.set(x, "getDomId", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
  }
}
