package typingsJapgolly.reactFileUtils

import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFileUtils.anon.OnFileChange
import typingsJapgolly.reactFileUtils.reactFileUtilsStrings.`type`
import typingsJapgolly.reactFileUtils.reactFileUtilsStrings.input
import typingsJapgolly.reactFileUtils.reactFileUtilsStrings.onChange
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsUploadButtonMod {
  
  @JSImport("react-file-utils/dist/components/UploadButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UploadButton(hasResetOnChangeOnFileChangeRest: UploadButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UploadButton")(hasResetOnChangeOnFileChangeRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type UploadButtonProps = OnFileChange & (Omit[ComponentProps[input], `type` | onChange])
}
