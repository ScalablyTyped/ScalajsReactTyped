package typingsJapgolly.reactNativeDocumentPicker

import typingsJapgolly.reactNativeDocumentPicker.anon.Android
import typingsJapgolly.reactNativeDocumentPicker.anon.Fn0
import typingsJapgolly.reactNativeDocumentPicker.anon.FnCall
import typingsJapgolly.reactNativeDocumentPicker.anon.FnCallOpts
import typingsJapgolly.reactNativeDocumentPicker.anon.ReadonlyreadonlyallFilesp
import typingsJapgolly.reactNativeDocumentPicker.anon.ReadonlyreadonlyallFilesr
import typingsJapgolly.reactNativeDocumentPicker.anon.ReadonlyreadonlyallFilesrAllFiles
import typingsJapgolly.reactNativeDocumentPicker.libTypescriptFileTypesMod.SupportedPlatforms
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.`import`
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.cachesDirectory
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.documentDirectory
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.formSheet
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.fullScreen
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.open
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.overFullScreen
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.pageSheet
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.presentationStyle
import typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.transitionStyle
import typingsJapgolly.std.Error
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-document-picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("react-native-document-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-document-picker", "default.isCancel")
    @js.native
    def isCancel: js.Function1[/* err */ Any, Boolean] = js.native
    inline def isCancel_=(x: js.Function1[/* err */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCancel")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker", "default.perPlatformTypes")
    @js.native
    def perPlatformTypes: Android = js.native
    inline def perPlatformTypes_=(x: Android): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("perPlatformTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker", "default.pick")
    @js.native
    def pick: FnCallOpts = js.native
    
    @JSImport("react-native-document-picker", "default.pickDirectory")
    @js.native
    def pickDirectory: FnCall = js.native
    inline def pickDirectory_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickDirectory")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker", "default.pickMultiple")
    @js.native
    def pickMultiple: FnCallOpts = js.native
    inline def pickMultiple_=(x: FnCallOpts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickMultiple")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker", "default.pickSingle")
    @js.native
    def pickSingle: Fn0 = js.native
    inline def pickSingle_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickSingle")(x.asInstanceOf[js.Any])
    
    inline def pick_=(x: FnCallOpts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pick")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker", "default.releaseSecureAccess")
    @js.native
    def releaseSecureAccess: js.Function1[/* uris */ js.Array[String], js.Promise[Unit]] = js.native
    inline def releaseSecureAccess_=(x: js.Function1[/* uris */ js.Array[String], js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("releaseSecureAccess")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker", "default.types")
    @js.native
    def types: ReadonlyreadonlyallFilesr | ReadonlyreadonlyallFilesp | ReadonlyreadonlyallFilesrAllFiles = js.native
    inline def types_=(x: ReadonlyreadonlyallFilesr | ReadonlyreadonlyallFilesp | ReadonlyreadonlyallFilesrAllFiles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  }
  
  inline def isCancel(err: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancel")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInProgress(err: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInProgress")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pick[OS /* <: SupportedPlatforms */](): js.Promise[js.Array[DocumentPickerResponse]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")().asInstanceOf[js.Promise[js.Array[DocumentPickerResponse]]]
  inline def pick[OS /* <: SupportedPlatforms */](opts: DocumentPickerOptions[OS]): js.Promise[js.Array[DocumentPickerResponse]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DocumentPickerResponse]]]
  
  inline def pickDirectory[OS /* <: SupportedPlatforms */](): js.Promise[DirectoryPickerResponse | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickDirectory")().asInstanceOf[js.Promise[DirectoryPickerResponse | Null]]
  inline def pickDirectory[OS /* <: SupportedPlatforms */](params: Pick[DocumentPickerOptions[OS], presentationStyle | transitionStyle]): js.Promise[DirectoryPickerResponse | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickDirectory")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DirectoryPickerResponse | Null]]
  
  inline def pickMultiple[OS /* <: SupportedPlatforms */](): js.Promise[js.Array[DocumentPickerResponse]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickMultiple")().asInstanceOf[js.Promise[js.Array[DocumentPickerResponse]]]
  inline def pickMultiple[OS /* <: SupportedPlatforms */](opts: DocumentPickerOptions[OS]): js.Promise[js.Array[DocumentPickerResponse]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickMultiple")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DocumentPickerResponse]]]
  
  inline def pickSingle[OS /* <: SupportedPlatforms */](): js.Promise[DocumentPickerResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickSingle")().asInstanceOf[js.Promise[DocumentPickerResponse]]
  inline def pickSingle[OS /* <: SupportedPlatforms */](opts: DocumentPickerOptions[OS]): js.Promise[DocumentPickerResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickSingle")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentPickerResponse]]
  
  inline def releaseSecureAccess(uris: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseSecureAccess")(uris.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("react-native-document-picker", "types")
  @js.native
  val types: ReadonlyreadonlyallFilesr | ReadonlyreadonlyallFilesp | ReadonlyreadonlyallFilesrAllFiles = js.native
  
  trait DirectoryPickerResponse extends StObject {
    
    var uri: String
  }
  object DirectoryPickerResponse {
    
    inline def apply(uri: String): DirectoryPickerResponse = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryPickerResponse]
    }
    
    extension [Self <: DirectoryPickerResponse](x: Self) {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  type :string | react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS][keyof react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS]] | std.Array<react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS][keyof react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS]] | string> | undefined,   mode :'import' | 'open' | undefined,   copyTo :'cachesDirectory' | 'documentDirectory' | undefined,   allowMultiSelection :boolean | undefined,   transitionStyle :react-native-document-picker.react-native-document-picker.TransitionStyle | undefined} & std.Pick<react-native.react-native.ModalPropsIOS, 'presentationStyle'> */
  trait DocumentPickerOptions[OS /* <: SupportedPlatforms */] extends StObject {
    
    var allowMultiSelection: js.UndefOr[Boolean] = js.undefined
    
    var copyTo: js.UndefOr[cachesDirectory | documentDirectory] = js.undefined
    
    var mode: js.UndefOr[`import` | open] = js.undefined
    
    var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.undefined
    
    var transitionStyle: js.UndefOr[TransitionStyle] = js.undefined
    
    var `type`: js.UndefOr[
        String | (/* import warning: importer.ImportType#apply Failed type conversion: react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS][keyof react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS]] */ js.Any) | (js.Array[
          (/* import warning: importer.ImportType#apply Failed type conversion: react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS][keyof react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS]] */ js.Any) | String
        ])
      ] = js.undefined
  }
  object DocumentPickerOptions {
    
    inline def apply[OS /* <: SupportedPlatforms */](): DocumentPickerOptions[OS] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentPickerOptions[OS]]
    }
    
    extension [Self <: DocumentPickerOptions[?], OS /* <: SupportedPlatforms */](x: Self & DocumentPickerOptions[OS]) {
      
      inline def setAllowMultiSelection(value: Boolean): Self = StObject.set(x, "allowMultiSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiSelectionUndefined: Self = StObject.set(x, "allowMultiSelection", js.undefined)
      
      inline def setCopyTo(value: cachesDirectory | documentDirectory): Self = StObject.set(x, "copyTo", value.asInstanceOf[js.Any])
      
      inline def setCopyToUndefined: Self = StObject.set(x, "copyTo", js.undefined)
      
      inline def setMode(value: `import` | open): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPresentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
      
      inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
      
      inline def setTransitionStyle(value: TransitionStyle): Self = StObject.set(x, "transitionStyle", value.asInstanceOf[js.Any])
      
      inline def setTransitionStyleUndefined: Self = StObject.set(x, "transitionStyle", js.undefined)
      
      inline def setType(
        value: String | (/* import warning: importer.ImportType#apply Failed type conversion: react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS][keyof react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS]] */ js.Any) | (js.Array[
              (/* import warning: importer.ImportType#apply Failed type conversion: react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS][keyof react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS]] */ js.Any) | String
            ])
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(
        value: ((/* import warning: importer.ImportType#apply Failed type conversion: react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS][keyof react-native-document-picker.react-native-document-picker/lib/typescript/fileTypes.PlatformTypes[OS]] */ js.Any) | String)*
      ): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  trait DocumentPickerResponse extends StObject {
    
    var copyError: js.UndefOr[String] = js.undefined
    
    var fileCopyUri: String | Null
    
    var name: String | Null
    
    var size: Double | Null
    
    var `type`: String | Null
    
    var uri: String
  }
  object DocumentPickerResponse {
    
    inline def apply(uri: String): DocumentPickerResponse = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], fileCopyUri = null, name = null, size = null)
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[DocumentPickerResponse]
    }
    
    extension [Self <: DocumentPickerResponse](x: Self) {
      
      inline def setCopyError(value: String): Self = StObject.set(x, "copyError", value.asInstanceOf[js.Any])
      
      inline def setCopyErrorUndefined: Self = StObject.set(x, "copyError", js.undefined)
      
      inline def setFileCopyUri(value: String): Self = StObject.set(x, "fileCopyUri", value.asInstanceOf[js.Any])
      
      inline def setFileCopyUriNull: Self = StObject.set(x, "fileCopyUri", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeModuleErrorShape
    extends StObject
       with Error {
    
    var code: js.UndefOr[String] = js.undefined
  }
  object NativeModuleErrorShape {
    
    inline def apply(message: String, name: String): NativeModuleErrorShape = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeModuleErrorShape]
    }
    
    extension [Self <: NativeModuleErrorShape](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.coverVertical
    - typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.flipHorizontal
    - typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.crossDissolve
    - typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.partialCurl
  */
  trait TransitionStyle extends StObject
  object TransitionStyle {
    
    inline def coverVertical: typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.coverVertical = "coverVertical".asInstanceOf[typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.coverVertical]
    
    inline def crossDissolve: typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.crossDissolve = "crossDissolve".asInstanceOf[typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.crossDissolve]
    
    inline def flipHorizontal: typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.flipHorizontal = "flipHorizontal".asInstanceOf[typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.flipHorizontal]
    
    inline def partialCurl: typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.partialCurl = "partialCurl".asInstanceOf[typingsJapgolly.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.partialCurl]
  }
}
