package typingsJapgolly.typestyle

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.typestyle.typesMod.FontFace
import typingsJapgolly.typestyle.typesMod.KeyFrames
import typingsJapgolly.typestyle.typesMod.MediaQuery
import typingsJapgolly.typestyle.typesMod.NestedCSSProperties
import typingsJapgolly.typestyle.typestyleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TypeStyle protected ()
    extends typingsJapgolly.typestyle.typestyleMod.TypeStyle {
    def this(hasAutoGenerateTag: AnonAutoGenerateTag) = this()
  }
  
  @JSName("classes")
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  def createTypeStyle(): typingsJapgolly.typestyle.typestyleMod.TypeStyle = js.native
  def createTypeStyle(target: AnonTextContent): typingsJapgolly.typestyle.typestyleMod.TypeStyle = js.native
  def cssRaw(mustBeValidCSS: String): Unit = js.native
  def cssRule(selector: String, objects: NestedCSSProperties*): Unit = js.native
  @JSName("extend")
  def extend_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): NestedCSSProperties = js.native
  def fontFace(fontFace: FontFace*): Unit = js.native
  def forceRenderStyles(): Unit = js.native
  def getStyles(): String = js.native
  def keyframes(frames: KeyFrames): String = js.native
  @JSName("media")
  def media_false(mediaQuery: MediaQuery, objects: (js.UndefOr[`false` | NestedCSSProperties | Null])*): NestedCSSProperties = js.native
  def reinit(): Unit = js.native
  def setStylesTarget(tag: AnonTextContent): Unit = js.native
  def stylesheet[Names /* <: String */](classes: Record[Names, NestedCSSProperties]): Record[Names, String] = js.native
  @js.native
  object style extends js.Object {
    def apply(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): String = js.native
  }
  
}

