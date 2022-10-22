package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.anon.PartialITagInputState
import typingsJapgolly.blueprintjsCore.anon.PartialTagInputProps
import typingsJapgolly.blueprintjsCore.anon.ReadonlyITagInputState
import typingsJapgolly.blueprintjsCore.anon.ReadonlyTagInputProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsTagInputTagInputMod.TagInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "TagInput")
@js.native
open class TagInput protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsMod.TagInput {
  def this(props: TagInputProps) = this()
  def this(props: TagInputProps, context: Any) = this()
}
/* static members */
object TagInput {
  
  @JSImport("@blueprintjs/core", "TagInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "TagInput.defaultProps")
  @js.native
  def defaultProps: PartialTagInputProps = js.native
  inline def defaultProps_=(x: PartialTagInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "TagInput.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(props: ReadonlyTagInputProps, state: ReadonlyITagInputState): PartialITagInputState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialITagInputState | Null]
}
