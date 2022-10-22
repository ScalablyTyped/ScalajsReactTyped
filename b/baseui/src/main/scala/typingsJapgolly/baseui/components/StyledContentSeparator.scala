package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.fileUploaderTypesMod.StyleProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledContentSeparator {
  
  inline def apply[C /* <: ElementType */](
    $afterFileDrop: Boolean,
    $isDisabled: Boolean,
    $isDragAccept: Boolean,
    $isDragActive: Boolean,
    $isDragReject: Boolean,
    $isFocused: Boolean
  ): SharedBuilder_AsOverrideProps1405319416[C] = {
    val __props = js.Dynamic.literal($afterFileDrop = $afterFileDrop.asInstanceOf[js.Any], $isDisabled = $isDisabled.asInstanceOf[js.Any], $isDragAccept = $isDragAccept.asInstanceOf[js.Any], $isDragActive = $isDragActive.asInstanceOf[js.Any], $isDragReject = $isDragReject.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps1405319416[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyleProps])]))
  }
  
  @JSImport("baseui/file-uploader", "StyledContentSeparator")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyleProps])): SharedBuilder_AsOverrideProps1405319416[C] = new SharedBuilder_AsOverrideProps1405319416[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
