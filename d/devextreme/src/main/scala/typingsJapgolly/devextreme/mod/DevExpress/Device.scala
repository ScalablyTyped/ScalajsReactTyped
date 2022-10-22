package typingsJapgolly.devextreme.mod.DevExpress

import typingsJapgolly.devextreme.devextremeStrings.A
import typingsJapgolly.devextreme.devextremeStrings.B
import typingsJapgolly.devextreme.devextremeStrings.C
import typingsJapgolly.devextreme.devextremeStrings.android
import typingsJapgolly.devextreme.devextremeStrings.desktop
import typingsJapgolly.devextreme.devextremeStrings.generic
import typingsJapgolly.devextreme.devextremeStrings.ios
import typingsJapgolly.devextreme.devextremeStrings.phone
import typingsJapgolly.devextreme.devextremeStrings.tablet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * Indicates whether or not the device platform is Android.
    */
  var android: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the type of the device on which the application is running.
    */
  var deviceType: js.UndefOr[phone | tablet | desktop] = js.undefined
  
  /**
    * Indicates whether or not the device platform is generic, which means that the application will look and behave according to a generic &apos;light&apos; or &apos;dark&apos; theme.
    */
  var generic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a performance grade of the current device.
    */
  var grade: js.UndefOr[A | B | C] = js.undefined
  
  /**
    * Indicates whether or not the device platform is iOS.
    */
  var ios: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether or not the device type is &apos;phone&apos;.
    */
  var phone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the platform of the device on which the application is running.
    */
  var platform: js.UndefOr[android | ios | generic] = js.undefined
  
  /**
    * Indicates whether or not the device type is &apos;tablet&apos;.
    */
  var tablet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies an array with the major and minor versions of the device platform.
    */
  var version: js.UndefOr[js.Array[Double]] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setDeviceType(value: phone | tablet | desktop): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setGeneric(value: Boolean): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    inline def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
    
    inline def setGrade(value: A | B | C): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
    
    inline def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
    
    inline def setIos(value: Boolean): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPlatform(value: android | ios | generic): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    
    inline def setVersion(value: js.Array[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: Double*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
