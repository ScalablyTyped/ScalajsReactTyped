package typingsJapgolly.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserPublic extends StObject {
  
  def getUnityObject(version: Double): Unity
}
object BrowserPublic {
  
  inline def apply(getUnityObject: Double => Unity): BrowserPublic = {
    val __obj = js.Dynamic.literal(getUnityObject = js.Any.fromFunction1(getUnityObject))
    __obj.asInstanceOf[BrowserPublic]
  }
  
  extension [Self <: BrowserPublic](x: Self) {
    
    inline def setGetUnityObject(value: Double => Unity): Self = StObject.set(x, "getUnityObject", js.Any.fromFunction1(value))
  }
}
