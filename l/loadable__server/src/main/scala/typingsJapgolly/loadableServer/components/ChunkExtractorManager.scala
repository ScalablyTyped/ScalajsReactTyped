package typingsJapgolly.loadableServer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.loadableServer.mod.ChunkExtractor
import typingsJapgolly.loadableServer.mod.ChunkExtractorManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ChunkExtractorManager {
  def apply(
    extractor: ChunkExtractor,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ChunkExtractorManagerProps, 
    typingsJapgolly.loadableServer.mod.ChunkExtractorManager, 
    Unit, 
    ChunkExtractorManagerProps
  ] = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.loadableServer.mod.ChunkExtractorManagerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.loadableServer.mod.ChunkExtractorManager](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.loadableServer.mod.ChunkExtractorManagerProps])(children: _*)
  }
  @JSImport("@loadable/server", "ChunkExtractorManager")
  @js.native
  object componentImport extends js.Object
  
}

