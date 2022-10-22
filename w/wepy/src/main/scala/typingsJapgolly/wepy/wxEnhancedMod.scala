package typingsJapgolly.wepy

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wepy.anon.Accuracy
import typingsJapgolly.wepy.anon.Address
import typingsJapgolly.wepy.anon.Alpha
import typingsJapgolly.wepy.anon.Altitude
import typingsJapgolly.wepy.anon.AnimationEnd
import typingsJapgolly.wepy.anon.AuthSetting
import typingsJapgolly.wepy.anon.BankAccount
import typingsJapgolly.wepy.anon.Brand
import typingsJapgolly.wepy.anon.Cancel
import typingsJapgolly.wepy.anon.CancelColor
import typingsJapgolly.wepy.anon.CanvasId
import typingsJapgolly.wepy.anon.CharSet
import typingsJapgolly.wepy.anon.CheckAuthMode
import typingsJapgolly.wepy.anon.Color
import typingsJapgolly.wepy.anon.Complete
import typingsJapgolly.wepy.anon.Compressed
import typingsJapgolly.wepy.anon.CreateTime
import typingsJapgolly.wepy.anon.Data
import typingsJapgolly.wepy.anon.DataKey
import typingsJapgolly.wepy.anon.Delay
import typingsJapgolly.wepy.anon.DestHeight
import typingsJapgolly.wepy.anon.Duration
import typingsJapgolly.wepy.anon.EncryptedData
import typingsJapgolly.wepy.anon.ErrMsg
import typingsJapgolly.wepy.anon.FileList
import typingsJapgolly.wepy.anon.Height
import typingsJapgolly.wepy.anon.Icon
import typingsJapgolly.wepy.anon.ItemColor
import typingsJapgolly.wepy.anon.Iv
import typingsJapgolly.wepy.anon.Key
import typingsJapgolly.wepy.anon.Lang
import typingsJapgolly.wepy.anon.Latitude
import typingsJapgolly.wepy.anon.NetworkType
import typingsJapgolly.wepy.anon.NonceStr
import typingsJapgolly.wepy.anon.Northeast
import typingsJapgolly.wepy.anon.OnlyFromCamera
import typingsJapgolly.wepy.anon.Padding
import typingsJapgolly.wepy.anon.PhoneNumber
import typingsJapgolly.wepy.anon.Scale
import typingsJapgolly.wepy.anon.Scope
import typingsJapgolly.wepy.anon.ScrollTop
import typingsJapgolly.wepy.anon.ShareTicket
import typingsJapgolly.wepy.anon.SupportMode
import typingsJapgolly.wepy.anon.TempFilePath
import typingsJapgolly.wepy.anon.Title
import typingsJapgolly.wepy.wepyStrings.CONNECT
import typingsJapgolly.wepy.wepyStrings.DELETE
import typingsJapgolly.wepy.wepyStrings.GET
import typingsJapgolly.wepy.wepyStrings.HEAD
import typingsJapgolly.wepy.wepyStrings.OPTIONS
import typingsJapgolly.wepy.wepyStrings.POST
import typingsJapgolly.wepy.wepyStrings.PUT
import typingsJapgolly.wepy.wepyStrings.TRACE
import typingsJapgolly.wepy.wepyStrings.arraybuffer
import typingsJapgolly.wepy.wepyStrings.json
import typingsJapgolly.wepy.wepyStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wxEnhancedMod {
  
  trait Animation
    extends StObject
       with RotateAnimation
       with ScaleAnimation
       with SkewAnimation
       with TranslateAnimation {
    
    def backgroundColor(x: String): Animation
    
    def bottom(x: Double): Animation
    
    def height(x: Double): Animation
    
    def left(x: Double): Animation
    
    def opacity(x: Double): Animation
    
    def right(x: Double): Animation
    
    def top(x: Double): Animation
    
    def width(x: Double): Animation
  }
  object Animation {
    
    inline def apply(
      backgroundColor: String => Animation,
      bottom: Double => Animation,
      height: Double => Animation,
      left: Double => Animation,
      opacity: Double => Animation,
      right: Double => Animation,
      rotate: Double => Animation,
      rotate3d: CallbackTo[Animation],
      rotateX: Double => Animation,
      rotateY: Double => Animation,
      rotateZ: Double => Animation,
      scale: Double => Animation,
      scale3d: CallbackTo[Animation],
      scaleX: Double => Animation,
      scaleY: Double => Animation,
      scaleZ: Double => Animation,
      skew: Double => Animation,
      skewX: Double => Animation,
      skewY: Double => Animation,
      top: Double => Animation,
      translate: Double => Animation,
      translate3d: CallbackTo[Animation],
      translateX: Double => Animation,
      translateY: Double => Animation,
      translateZ: Double => Animation,
      width: Double => Animation
    ): Animation = {
      val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor), bottom = js.Any.fromFunction1(bottom), height = js.Any.fromFunction1(height), left = js.Any.fromFunction1(left), opacity = js.Any.fromFunction1(opacity), right = js.Any.fromFunction1(right), rotate = js.Any.fromFunction1(rotate), rotate3d = rotate3d.toJsFn, rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ), scale = js.Any.fromFunction1(scale), scale3d = scale3d.toJsFn, scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ), skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY), top = js.Any.fromFunction1(top), translate = js.Any.fromFunction1(translate), translate3d = translate3d.toJsFn, translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ), width = js.Any.fromFunction1(width))
      __obj.asInstanceOf[Animation]
    }
    
    extension [Self <: Animation](x: Self) {
      
      inline def setBackgroundColor(value: String => Animation): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
      
      inline def setBottom(value: Double => Animation): Self = StObject.set(x, "bottom", js.Any.fromFunction1(value))
      
      inline def setHeight(value: Double => Animation): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
      
      inline def setLeft(value: Double => Animation): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setOpacity(value: Double => Animation): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
      
      inline def setRight(value: Double => Animation): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setTop(value: Double => Animation): Self = StObject.set(x, "top", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double => Animation): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
    }
  }
  
  type CallbackFunction[T] = js.Function1[/* callbacks */ Complete[T], Unit]
  
  trait FilePathParam extends StObject {
    
    var filePath: String
  }
  object FilePathParam {
    
    inline def apply(filePath: String): FilePathParam = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePathParam]
    }
    
    extension [Self <: FilePathParam](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait LagLng extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object LagLng {
    
    inline def apply(latitude: Double, longitude: Double): LagLng = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[LagLng]
    }
    
    extension [Self <: LagLng](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapContext extends StObject {
    
    def getCenterLocation(callbacks: Complete[LagLng]): Unit
    @JSName("getCenterLocation")
    var getCenterLocation_Original: CallbackFunction[LagLng]
    
    def getRegion(callbacks: Complete[Northeast]): Unit
    @JSName("getRegion")
    var getRegion_Original: CallbackFunction[Northeast]
    
    def getScale(callbacks: Complete[Scale]): Unit
    @JSName("getScale")
    var getScale_Original: CallbackFunction[Scale]
    
    def includePoints(params: Padding): Unit
    
    def moveToLocation(): Unit
    
    def translateMarker(params: AnimationEnd): Unit
  }
  object MapContext {
    
    inline def apply(
      getCenterLocation: /* callbacks */ Complete[LagLng] => Callback,
      getRegion: /* callbacks */ Complete[Northeast] => Callback,
      getScale: /* callbacks */ Complete[Scale] => Callback,
      includePoints: Padding => Callback,
      moveToLocation: Callback,
      translateMarker: AnimationEnd => Callback
    ): MapContext = {
      val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1((t0: /* callbacks */ Complete[LagLng]) => getCenterLocation(t0).runNow()), getRegion = js.Any.fromFunction1((t0: /* callbacks */ Complete[Northeast]) => getRegion(t0).runNow()), getScale = js.Any.fromFunction1((t0: /* callbacks */ Complete[Scale]) => getScale(t0).runNow()), includePoints = js.Any.fromFunction1((t0: Padding) => includePoints(t0).runNow()), moveToLocation = moveToLocation.toJsFn, translateMarker = js.Any.fromFunction1((t0: AnimationEnd) => translateMarker(t0).runNow()))
      __obj.asInstanceOf[MapContext]
    }
    
    extension [Self <: MapContext](x: Self) {
      
      inline def setGetCenterLocation(value: /* callbacks */ Complete[LagLng] => Callback): Self = StObject.set(x, "getCenterLocation", js.Any.fromFunction1((t0: /* callbacks */ Complete[LagLng]) => value(t0).runNow()))
      
      inline def setGetRegion(value: /* callbacks */ Complete[Northeast] => Callback): Self = StObject.set(x, "getRegion", js.Any.fromFunction1((t0: /* callbacks */ Complete[Northeast]) => value(t0).runNow()))
      
      inline def setGetScale(value: /* callbacks */ Complete[Scale] => Callback): Self = StObject.set(x, "getScale", js.Any.fromFunction1((t0: /* callbacks */ Complete[Scale]) => value(t0).runNow()))
      
      inline def setIncludePoints(value: Padding => Callback): Self = StObject.set(x, "includePoints", js.Any.fromFunction1((t0: Padding) => value(t0).runNow()))
      
      inline def setMoveToLocation(value: Callback): Self = StObject.set(x, "moveToLocation", value.toJsFn)
      
      inline def setTranslateMarker(value: AnimationEnd => Callback): Self = StObject.set(x, "translateMarker", js.Any.fromFunction1((t0: AnimationEnd) => value(t0).runNow()))
    }
  }
  
  trait RequestParam
    extends StObject
       with UrlParam {
    
    var data: js.UndefOr[js.Object | String | js.typedarray.ArrayBuffer] = js.undefined
    
    var dataType: js.UndefOr[json | text] = js.undefined
    
    var header: js.UndefOr[js.Object] = js.undefined
    
    var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
    
    var responseType: js.UndefOr[text | arraybuffer] = js.undefined
  }
  object RequestParam {
    
    inline def apply(url: String): RequestParam = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestParam]
    }
    
    extension [Self <: RequestParam](x: Self) {
      
      inline def setData(value: js.Object | String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: json | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setMethod(value: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setResponseType(value: text | arraybuffer): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    }
  }
  
  trait RotateAnimation extends StObject {
    
    def rotate(deg: Double): Animation
    
    def rotate3d(): Animation
    
    def rotateX(deg: Double): Animation
    
    def rotateY(deg: Double): Animation
    
    def rotateZ(deg: Double): Animation
  }
  object RotateAnimation {
    
    inline def apply(
      rotate: Double => Animation,
      rotate3d: CallbackTo[Animation],
      rotateX: Double => Animation,
      rotateY: Double => Animation,
      rotateZ: Double => Animation
    ): RotateAnimation = {
      val __obj = js.Dynamic.literal(rotate = js.Any.fromFunction1(rotate), rotate3d = rotate3d.toJsFn, rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ))
      __obj.asInstanceOf[RotateAnimation]
    }
    
    extension [Self <: RotateAnimation](x: Self) {
      
      inline def setRotate(value: Double => Animation): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setRotate3d(value: CallbackTo[Animation]): Self = StObject.set(x, "rotate3d", value.toJsFn)
      
      inline def setRotateX(value: Double => Animation): Self = StObject.set(x, "rotateX", js.Any.fromFunction1(value))
      
      inline def setRotateY(value: Double => Animation): Self = StObject.set(x, "rotateY", js.Any.fromFunction1(value))
      
      inline def setRotateZ(value: Double => Animation): Self = StObject.set(x, "rotateZ", js.Any.fromFunction1(value))
    }
  }
  
  trait ScaleAnimation extends StObject {
    
    def scale(sx: Double): Animation
    
    def scale3d(): Animation
    
    def scaleX(sx: Double): Animation
    
    def scaleY(sy: Double): Animation
    
    def scaleZ(sz: Double): Animation
  }
  object ScaleAnimation {
    
    inline def apply(
      scale: Double => Animation,
      scale3d: CallbackTo[Animation],
      scaleX: Double => Animation,
      scaleY: Double => Animation,
      scaleZ: Double => Animation
    ): ScaleAnimation = {
      val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale), scale3d = scale3d.toJsFn, scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ))
      __obj.asInstanceOf[ScaleAnimation]
    }
    
    extension [Self <: ScaleAnimation](x: Self) {
      
      inline def setScale(value: Double => Animation): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
      
      inline def setScale3d(value: CallbackTo[Animation]): Self = StObject.set(x, "scale3d", value.toJsFn)
      
      inline def setScaleX(value: Double => Animation): Self = StObject.set(x, "scaleX", js.Any.fromFunction1(value))
      
      inline def setScaleY(value: Double => Animation): Self = StObject.set(x, "scaleY", js.Any.fromFunction1(value))
      
      inline def setScaleZ(value: Double => Animation): Self = StObject.set(x, "scaleZ", js.Any.fromFunction1(value))
    }
  }
  
  trait SkewAnimation extends StObject {
    
    def skew(ax: Double): Animation
    
    def skewX(ax: Double): Animation
    
    def skewY(ay: Double): Animation
  }
  object SkewAnimation {
    
    inline def apply(skew: Double => Animation, skewX: Double => Animation, skewY: Double => Animation): SkewAnimation = {
      val __obj = js.Dynamic.literal(skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY))
      __obj.asInstanceOf[SkewAnimation]
    }
    
    extension [Self <: SkewAnimation](x: Self) {
      
      inline def setSkew(value: Double => Animation): Self = StObject.set(x, "skew", js.Any.fromFunction1(value))
      
      inline def setSkewX(value: Double => Animation): Self = StObject.set(x, "skewX", js.Any.fromFunction1(value))
      
      inline def setSkewY(value: Double => Animation): Self = StObject.set(x, "skewY", js.Any.fromFunction1(value))
    }
  }
  
  trait TranslateAnimation extends StObject {
    
    def translate(tx: Double): Animation
    
    def translate3d(): Animation
    
    def translateX(tx: Double): Animation
    
    def translateY(ty: Double): Animation
    
    def translateZ(tz: Double): Animation
  }
  object TranslateAnimation {
    
    inline def apply(
      translate: Double => Animation,
      translate3d: CallbackTo[Animation],
      translateX: Double => Animation,
      translateY: Double => Animation,
      translateZ: Double => Animation
    ): TranslateAnimation = {
      val __obj = js.Dynamic.literal(translate = js.Any.fromFunction1(translate), translate3d = translate3d.toJsFn, translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ))
      __obj.asInstanceOf[TranslateAnimation]
    }
    
    extension [Self <: TranslateAnimation](x: Self) {
      
      inline def setTranslate(value: Double => Animation): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
      
      inline def setTranslate3d(value: CallbackTo[Animation]): Self = StObject.set(x, "translate3d", value.toJsFn)
      
      inline def setTranslateX(value: Double => Animation): Self = StObject.set(x, "translateX", js.Any.fromFunction1(value))
      
      inline def setTranslateY(value: Double => Animation): Self = StObject.set(x, "translateY", js.Any.fromFunction1(value))
      
      inline def setTranslateZ(value: Double => Animation): Self = StObject.set(x, "translateZ", js.Any.fromFunction1(value))
    }
  }
  
  trait UrlParam extends StObject {
    
    var url: String
  }
  object UrlParam {
    
    inline def apply(url: String): UrlParam = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlParam]
    }
    
    extension [Self <: UrlParam](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserInfo extends StObject {
    
    var avatarUrl: String
    
    var city: String
    
    var country: String
    
    var gender: String
    
    var language: String
    
    var nickName: String
    
    var province: String
  }
  object UserInfo {
    
    inline def apply(
      avatarUrl: String,
      city: String,
      country: String,
      gender: String,
      language: String,
      nickName: String,
      province: String
    ): UserInfo = {
      val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    extension [Self <: UserInfo](x: Self) {
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
      
      inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    }
  }
  
  trait WechatProfileDetails extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var homeAddressCity: js.UndefOr[String] = js.undefined
    
    var homeAddressCountry: js.UndefOr[String] = js.undefined
    
    var homeAddressPostalCode: js.UndefOr[String] = js.undefined
    
    var homeAddressState: js.UndefOr[String] = js.undefined
    
    var homeAddressStreet: js.UndefOr[String] = js.undefined
    
    var homeFaxNumber: js.UndefOr[String] = js.undefined
    
    var homePhoneNumber: js.UndefOr[String] = js.undefined
    
    var lastName: js.UndefOr[String] = js.undefined
    
    var middleName: js.UndefOr[String] = js.undefined
    
    var mobilePhoneNumber: js.UndefOr[String] = js.undefined
    
    var nickName: js.UndefOr[String] = js.undefined
    
    var photoFilePath: js.UndefOr[String] = js.undefined
    
    var remark: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var workAddressCity: js.UndefOr[String] = js.undefined
    
    var workAddressCountry: js.UndefOr[String] = js.undefined
    
    var workAddressPostalCode: js.UndefOr[String] = js.undefined
    
    var workAddressState: js.UndefOr[String] = js.undefined
    
    var workAddressStreet: js.UndefOr[String] = js.undefined
  }
  object WechatProfileDetails {
    
    inline def apply(): WechatProfileDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WechatProfileDetails]
    }
    
    extension [Self <: WechatProfileDetails](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setHomeAddressCity(value: String): Self = StObject.set(x, "homeAddressCity", value.asInstanceOf[js.Any])
      
      inline def setHomeAddressCityUndefined: Self = StObject.set(x, "homeAddressCity", js.undefined)
      
      inline def setHomeAddressCountry(value: String): Self = StObject.set(x, "homeAddressCountry", value.asInstanceOf[js.Any])
      
      inline def setHomeAddressCountryUndefined: Self = StObject.set(x, "homeAddressCountry", js.undefined)
      
      inline def setHomeAddressPostalCode(value: String): Self = StObject.set(x, "homeAddressPostalCode", value.asInstanceOf[js.Any])
      
      inline def setHomeAddressPostalCodeUndefined: Self = StObject.set(x, "homeAddressPostalCode", js.undefined)
      
      inline def setHomeAddressState(value: String): Self = StObject.set(x, "homeAddressState", value.asInstanceOf[js.Any])
      
      inline def setHomeAddressStateUndefined: Self = StObject.set(x, "homeAddressState", js.undefined)
      
      inline def setHomeAddressStreet(value: String): Self = StObject.set(x, "homeAddressStreet", value.asInstanceOf[js.Any])
      
      inline def setHomeAddressStreetUndefined: Self = StObject.set(x, "homeAddressStreet", js.undefined)
      
      inline def setHomeFaxNumber(value: String): Self = StObject.set(x, "homeFaxNumber", value.asInstanceOf[js.Any])
      
      inline def setHomeFaxNumberUndefined: Self = StObject.set(x, "homeFaxNumber", js.undefined)
      
      inline def setHomePhoneNumber(value: String): Self = StObject.set(x, "homePhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setHomePhoneNumberUndefined: Self = StObject.set(x, "homePhoneNumber", js.undefined)
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
      
      inline def setMobilePhoneNumber(value: String): Self = StObject.set(x, "mobilePhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setMobilePhoneNumberUndefined: Self = StObject.set(x, "mobilePhoneNumber", js.undefined)
      
      inline def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
      
      inline def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
      
      inline def setPhotoFilePath(value: String): Self = StObject.set(x, "photoFilePath", value.asInstanceOf[js.Any])
      
      inline def setPhotoFilePathUndefined: Self = StObject.set(x, "photoFilePath", js.undefined)
      
      inline def setRemark(value: String): Self = StObject.set(x, "remark", value.asInstanceOf[js.Any])
      
      inline def setRemarkUndefined: Self = StObject.set(x, "remark", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWorkAddressCity(value: String): Self = StObject.set(x, "workAddressCity", value.asInstanceOf[js.Any])
      
      inline def setWorkAddressCityUndefined: Self = StObject.set(x, "workAddressCity", js.undefined)
      
      inline def setWorkAddressCountry(value: String): Self = StObject.set(x, "workAddressCountry", value.asInstanceOf[js.Any])
      
      inline def setWorkAddressCountryUndefined: Self = StObject.set(x, "workAddressCountry", js.undefined)
      
      inline def setWorkAddressPostalCode(value: String): Self = StObject.set(x, "workAddressPostalCode", value.asInstanceOf[js.Any])
      
      inline def setWorkAddressPostalCodeUndefined: Self = StObject.set(x, "workAddressPostalCode", js.undefined)
      
      inline def setWorkAddressState(value: String): Self = StObject.set(x, "workAddressState", value.asInstanceOf[js.Any])
      
      inline def setWorkAddressStateUndefined: Self = StObject.set(x, "workAddressState", js.undefined)
      
      inline def setWorkAddressStreet(value: String): Self = StObject.set(x, "workAddressStreet", value.asInstanceOf[js.Any])
      
      inline def setWorkAddressStreetUndefined: Self = StObject.set(x, "workAddressStreet", js.undefined)
    }
  }
  
  @js.native
  trait WxEnhances extends StObject {
    
    def addPhoneContact(param: WechatProfileDetails): js.Promise[Unit] = js.native
    
    def authorize(param: Scope): js.Promise[Any] = js.native
    
    def canIUse(name: String): js.Promise[Boolean] = js.native
    
    def canvasGetImageData(params: CanvasId, context: Any): js.Promise[Data] = js.native
    
    def canvasPutImageData(params: Height, context: Any): js.Promise[Unit] = js.native
    
    def canvasToTempFilePath(params: DestHeight, context: Any): js.Promise[TempFilePath] = js.native
    
    def checkIsSoterEnrolledInDevice(params: CheckAuthMode): js.Promise[ErrMsg] = js.native
    
    def checkIsSupportSoterAuthentication(): js.Promise[SupportMode] = js.native
    
    def checkSession(): js.Promise[Unit] = js.native
    
    def chooseInvoiceTitle(): js.Promise[BankAccount] = js.native
    
    def chooseLocation(): js.Promise[Address] = js.native
    
    def chooseVideo(params: Compressed): js.Promise[Duration] = js.native
    
    def clearStorage(): js.Promise[Unit] = js.native
    
    def createAnimation(params: Delay): js.Promise[Animation] = js.native
    
    def createCanvasContext(canvasId: String, context: Any): js.Promise[Unit] = js.native
    
    def createMapContext(mapId: String, context: Any): MapContext = js.native
    
    def createSelectorQuery(): js.Promise[js.Object] = js.native
    
    def getLocation(params: Altitude): js.Promise[Accuracy] = js.native
    
    def getNetworkType(): js.Promise[NetworkType] = js.native
    
    def getSavedFileInfo(params: FilePathParam): js.Promise[CreateTime] = js.native
    
    def getSavedFileList(): js.Promise[FileList] = js.native
    
    def getSetting(): js.Promise[AuthSetting] = js.native
    
    def getShareInfo(params: ShareTicket): js.Promise[EncryptedData] = js.native
    
    def getSystemInfo(): js.Promise[Brand] = js.native
    
    def getUserInfo(params: Lang): js.Promise[Iv] = js.native
    
    def hideLoading(): js.Promise[Unit] = js.native
    
    def hideNavigationBarLoading(): js.Promise[Unit] = js.native
    
    def makePhoneCall(params: PhoneNumber): js.Promise[Unit] = js.native
    
    def navigateTo(params: UrlParam): js.Promise[Unit] = js.native
    
    def onUserCaptureScreen(): js.Promise[Unit] = js.native
    
    def openLocation(params: Latitude): js.Promise[Unit] = js.native
    
    def pageScrollTo(params: ScrollTop): js.Promise[Unit] = js.native
    
    def redirectTo(params: UrlParam): js.Promise[Unit] = js.native
    
    def removeSavedFile(params: FilePathParam): js.Promise[Unit] = js.native
    
    def removeStorage(params: Key): js.Promise[Unit] = js.native
    
    def request(params: String): js.Promise[Any] = js.native
    def request(params: RequestParam): js.Promise[Any] = js.native
    
    def requestPayment(params: NonceStr): js.Promise[Unit] = js.native
    
    def scanCode(params: OnlyFromCamera): js.Promise[CharSet] = js.native
    
    def setNavigationBarAlpha(params: Alpha): js.Promise[Unit] = js.native
    
    def setNavigationBarColor(params: Color): js.Promise[Unit] = js.native
    
    def setNavigationBarTitle(params: Title): js.Promise[Unit] = js.native
    
    def setStorage(params: DataKey): js.Promise[Unit] = js.native
    
    def showActionSheet(params: ItemColor): js.Promise[Unit] = js.native
    
    def showLoading(params: Title): js.Promise[Unit] = js.native
    
    def showModal(params: CancelColor): js.Promise[Cancel] = js.native
    
    def showNavigationBarLoading(): js.Promise[Unit] = js.native
    
    def showToast(params: Icon): js.Promise[Unit] = js.native
    
    def switchTab(params: UrlParam): js.Promise[Unit] = js.native
  }
}
