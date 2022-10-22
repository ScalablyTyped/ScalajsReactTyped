package typingsJapgolly.winrt.Windows.System

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Globalization.DayOfWeek
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UserProfile {
  
  @js.native
  sealed trait AccountPictureKind extends StObject
  @JSGlobal("Windows.System.UserProfile.AccountPictureKind")
  @js.native
  object AccountPictureKind extends StObject {
    
    @js.native
    sealed trait largeImage
      extends StObject
         with AccountPictureKind
    
    @js.native
    sealed trait smallImage
      extends StObject
         with AccountPictureKind
    
    @js.native
    sealed trait video
      extends StObject
         with AccountPictureKind
  }
  
  @js.native
  sealed trait SetAccountPictureResult extends StObject
  @JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
  @js.native
  object SetAccountPictureResult extends StObject {
    
    @js.native
    sealed trait changeDisabled
      extends StObject
         with SetAccountPictureResult
    
    @js.native
    sealed trait failure
      extends StObject
         with SetAccountPictureResult
    
    @js.native
    sealed trait fileSizeError
      extends StObject
         with SetAccountPictureResult
    
    @js.native
    sealed trait largeOrDynamicError
      extends StObject
         with SetAccountPictureResult
    
    @js.native
    sealed trait success
      extends StObject
         with SetAccountPictureResult
    
    @js.native
    sealed trait videoFrameSizeError
      extends StObject
         with SetAccountPictureResult
  }
  
  trait GlobalizationPreferences extends StObject
  
  trait IGlobalizationPreferencesStatics extends StObject {
    
    var calendars: IVectorView[String]
    
    var clocks: IVectorView[String]
    
    var currencies: IVectorView[String]
    
    var homeGeographicRegion: String
    
    var languages: IVectorView[String]
    
    var weekStartsOn: DayOfWeek
  }
  object IGlobalizationPreferencesStatics {
    
    inline def apply(
      calendars: IVectorView[String],
      clocks: IVectorView[String],
      currencies: IVectorView[String],
      homeGeographicRegion: String,
      languages: IVectorView[String],
      weekStartsOn: DayOfWeek
    ): IGlobalizationPreferencesStatics = {
      val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], clocks = clocks.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], homeGeographicRegion = homeGeographicRegion.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], weekStartsOn = weekStartsOn.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGlobalizationPreferencesStatics]
    }
    
    extension [Self <: IGlobalizationPreferencesStatics](x: Self) {
      
      inline def setCalendars(value: IVectorView[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      inline def setClocks(value: IVectorView[String]): Self = StObject.set(x, "clocks", value.asInstanceOf[js.Any])
      
      inline def setCurrencies(value: IVectorView[String]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
      
      inline def setHomeGeographicRegion(value: String): Self = StObject.set(x, "homeGeographicRegion", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: IVectorView[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOn(value: DayOfWeek): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILockScreenStatics extends StObject {
    
    def getImageStream(): IRandomAccessStream
    
    var originalImageFile: Uri
    
    def setImageFileAsync(value: IStorageFile): IAsyncAction
    
    def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction
  }
  object ILockScreenStatics {
    
    inline def apply(
      getImageStream: CallbackTo[IRandomAccessStream],
      originalImageFile: Uri,
      setImageFileAsync: IStorageFile => IAsyncAction,
      setImageStreamAsync: IRandomAccessStream => IAsyncAction
    ): ILockScreenStatics = {
      val __obj = js.Dynamic.literal(getImageStream = getImageStream.toJsFn, originalImageFile = originalImageFile.asInstanceOf[js.Any], setImageFileAsync = js.Any.fromFunction1(setImageFileAsync), setImageStreamAsync = js.Any.fromFunction1(setImageStreamAsync))
      __obj.asInstanceOf[ILockScreenStatics]
    }
    
    extension [Self <: ILockScreenStatics](x: Self) {
      
      inline def setGetImageStream(value: CallbackTo[IRandomAccessStream]): Self = StObject.set(x, "getImageStream", value.toJsFn)
      
      inline def setOriginalImageFile(value: Uri): Self = StObject.set(x, "originalImageFile", value.asInstanceOf[js.Any])
      
      inline def setSetImageFileAsync(value: IStorageFile => IAsyncAction): Self = StObject.set(x, "setImageFileAsync", js.Any.fromFunction1(value))
      
      inline def setSetImageStreamAsync(value: IRandomAccessStream => IAsyncAction): Self = StObject.set(x, "setImageStreamAsync", js.Any.fromFunction1(value))
    }
  }
  
  trait IUserInformationStatics extends StObject {
    
    var accountPictureChangeEnabled: Boolean
    
    def getAccountPicture(kind: AccountPictureKind): IStorageFile
    
    def getDisplayNameAsync(): IAsyncOperation[String]
    
    def getDomainNameAsync(): IAsyncOperation[String]
    
    def getFirstNameAsync(): IAsyncOperation[String]
    
    def getLastNameAsync(): IAsyncOperation[String]
    
    def getPrincipalNameAsync(): IAsyncOperation[String]
    
    def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri]
    
    var nameAccessAllowed: Boolean
    
    var onaccountpicturechanged: Any
    
    def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult]
    
    def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult]
    
    def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult]
    
    def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult]
  }
  object IUserInformationStatics {
    
    inline def apply(
      accountPictureChangeEnabled: Boolean,
      getAccountPicture: AccountPictureKind => IStorageFile,
      getDisplayNameAsync: CallbackTo[IAsyncOperation[String]],
      getDomainNameAsync: CallbackTo[IAsyncOperation[String]],
      getFirstNameAsync: CallbackTo[IAsyncOperation[String]],
      getLastNameAsync: CallbackTo[IAsyncOperation[String]],
      getPrincipalNameAsync: CallbackTo[IAsyncOperation[String]],
      getSessionInitiationProtocolUriAsync: CallbackTo[IAsyncOperation[Uri]],
      nameAccessAllowed: Boolean,
      onaccountpicturechanged: Any,
      setAccountPictureAsync: IStorageFile => IAsyncOperation[SetAccountPictureResult],
      setAccountPictureFromStreamAsync: IRandomAccessStream => IAsyncOperation[SetAccountPictureResult],
      setAccountPicturesAsync: (IStorageFile, IStorageFile, IStorageFile) => IAsyncOperation[SetAccountPictureResult],
      setAccountPicturesFromStreamsAsync: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => IAsyncOperation[SetAccountPictureResult]
    ): IUserInformationStatics = {
      val __obj = js.Dynamic.literal(accountPictureChangeEnabled = accountPictureChangeEnabled.asInstanceOf[js.Any], getAccountPicture = js.Any.fromFunction1(getAccountPicture), getDisplayNameAsync = getDisplayNameAsync.toJsFn, getDomainNameAsync = getDomainNameAsync.toJsFn, getFirstNameAsync = getFirstNameAsync.toJsFn, getLastNameAsync = getLastNameAsync.toJsFn, getPrincipalNameAsync = getPrincipalNameAsync.toJsFn, getSessionInitiationProtocolUriAsync = getSessionInitiationProtocolUriAsync.toJsFn, nameAccessAllowed = nameAccessAllowed.asInstanceOf[js.Any], onaccountpicturechanged = onaccountpicturechanged.asInstanceOf[js.Any], setAccountPictureAsync = js.Any.fromFunction1(setAccountPictureAsync), setAccountPictureFromStreamAsync = js.Any.fromFunction1(setAccountPictureFromStreamAsync), setAccountPicturesAsync = js.Any.fromFunction3(setAccountPicturesAsync), setAccountPicturesFromStreamsAsync = js.Any.fromFunction3(setAccountPicturesFromStreamsAsync))
      __obj.asInstanceOf[IUserInformationStatics]
    }
    
    extension [Self <: IUserInformationStatics](x: Self) {
      
      inline def setAccountPictureChangeEnabled(value: Boolean): Self = StObject.set(x, "accountPictureChangeEnabled", value.asInstanceOf[js.Any])
      
      inline def setGetAccountPicture(value: AccountPictureKind => IStorageFile): Self = StObject.set(x, "getAccountPicture", js.Any.fromFunction1(value))
      
      inline def setGetDisplayNameAsync(value: CallbackTo[IAsyncOperation[String]]): Self = StObject.set(x, "getDisplayNameAsync", value.toJsFn)
      
      inline def setGetDomainNameAsync(value: CallbackTo[IAsyncOperation[String]]): Self = StObject.set(x, "getDomainNameAsync", value.toJsFn)
      
      inline def setGetFirstNameAsync(value: CallbackTo[IAsyncOperation[String]]): Self = StObject.set(x, "getFirstNameAsync", value.toJsFn)
      
      inline def setGetLastNameAsync(value: CallbackTo[IAsyncOperation[String]]): Self = StObject.set(x, "getLastNameAsync", value.toJsFn)
      
      inline def setGetPrincipalNameAsync(value: CallbackTo[IAsyncOperation[String]]): Self = StObject.set(x, "getPrincipalNameAsync", value.toJsFn)
      
      inline def setGetSessionInitiationProtocolUriAsync(value: CallbackTo[IAsyncOperation[Uri]]): Self = StObject.set(x, "getSessionInitiationProtocolUriAsync", value.toJsFn)
      
      inline def setNameAccessAllowed(value: Boolean): Self = StObject.set(x, "nameAccessAllowed", value.asInstanceOf[js.Any])
      
      inline def setOnaccountpicturechanged(value: Any): Self = StObject.set(x, "onaccountpicturechanged", value.asInstanceOf[js.Any])
      
      inline def setSetAccountPictureAsync(value: IStorageFile => IAsyncOperation[SetAccountPictureResult]): Self = StObject.set(x, "setAccountPictureAsync", js.Any.fromFunction1(value))
      
      inline def setSetAccountPictureFromStreamAsync(value: IRandomAccessStream => IAsyncOperation[SetAccountPictureResult]): Self = StObject.set(x, "setAccountPictureFromStreamAsync", js.Any.fromFunction1(value))
      
      inline def setSetAccountPicturesAsync(value: (IStorageFile, IStorageFile, IStorageFile) => IAsyncOperation[SetAccountPictureResult]): Self = StObject.set(x, "setAccountPicturesAsync", js.Any.fromFunction3(value))
      
      inline def setSetAccountPicturesFromStreamsAsync(
        value: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => IAsyncOperation[SetAccountPictureResult]
      ): Self = StObject.set(x, "setAccountPicturesFromStreamsAsync", js.Any.fromFunction3(value))
    }
  }
  
  trait LockScreen extends StObject
  
  trait UserInformation extends StObject
}
