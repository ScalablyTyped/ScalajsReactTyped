package typingsJapgolly.reactNativeZssRichTextEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColorHandler = js.Function1[/* color */ java.lang.String, scala.Unit]
  type ContentGetHandler = js.Function0[js.Promise[java.lang.String]]
  type ContentSetHandler = js.Function1[/* html */ java.lang.String, scala.Unit]
  type ContentStylesHandler = js.Function1[
    /* styles */ typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextStyles, 
    scala.Unit
  ]
  type ElementStyles = typingsJapgolly.reactNative.mod.StyleProp[
    typingsJapgolly.reactNative.mod.ViewStyle | typingsJapgolly.reactNative.mod.TextStyle | typingsJapgolly.reactNative.mod.ImageStyle
  ]
  type FocusHandler = js.Function1[
    /* callback */ typingsJapgolly.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs, 
    scala.Unit
  ]
  type FunctionWithZeroArgs = js.Function0[scala.Unit]
  type IconsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactNative.mod.ImageSourcePropType]
  type ImageHandler = js.Function1[/* attributes */ typingsJapgolly.reactNative.mod.ImageProps, scala.Unit]
  type LinkDialogHandler = js.Function2[/* optionalTitle */ java.lang.String, /* optionalUrl */ java.lang.String, scala.Unit]
  type LinkHandler = js.Function2[/* url */ java.lang.String, /* title */ java.lang.String, scala.Unit]
  type PlaceHolderHandler = js.Function1[/* placeholder */ java.lang.String, scala.Unit]
  type RichTextStyles = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactNativeZssRichTextEditor.mod.ElementStyles]
}
