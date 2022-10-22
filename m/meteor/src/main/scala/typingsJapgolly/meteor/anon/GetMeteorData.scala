package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMeteorData[TOwnProps, TDataProps] extends StObject {
  
  def getMeteorData(props: TOwnProps): TDataProps
  
  var pure: js.UndefOr[Boolean] = js.undefined
}
object GetMeteorData {
  
  inline def apply[TOwnProps, TDataProps](getMeteorData: TOwnProps => TDataProps): GetMeteorData[TOwnProps, TDataProps] = {
    val __obj = js.Dynamic.literal(getMeteorData = js.Any.fromFunction1(getMeteorData))
    __obj.asInstanceOf[GetMeteorData[TOwnProps, TDataProps]]
  }
  
  extension [Self <: GetMeteorData[?, ?], TOwnProps, TDataProps](x: Self & (GetMeteorData[TOwnProps, TDataProps])) {
    
    inline def setGetMeteorData(value: TOwnProps => TDataProps): Self = StObject.set(x, "getMeteorData", js.Any.fromFunction1(value))
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
  }
}
