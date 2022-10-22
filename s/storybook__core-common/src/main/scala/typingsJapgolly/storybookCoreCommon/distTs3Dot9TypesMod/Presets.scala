package typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod

import typingsJapgolly.babelCore.mod.TransformOptions
import typingsJapgolly.storybookCoreCommon.anon.BabelOptions
import typingsJapgolly.storybookCoreCommon.anon.OptionsbabelOptionsTransf
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.babel
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.core
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.entries
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.managerEntries
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.managerWebpack
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.refs
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.stories
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.typescript
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.webpack
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Presets extends StObject {
  
  @JSName("apply")
  def apply[T /* <: Any */](`extension`: String): js.Promise[T] = js.native
  @JSName("apply")
  def apply[T /* <: Any */](`extension`: String, config: T): js.Promise[T] = js.native
  @JSName("apply")
  def apply[T /* <: Any */](`extension`: String, config: T, args: Any): js.Promise[T] = js.native
  @JSName("apply")
  def apply[T /* <: Any */](`extension`: String, config: Unit, args: Any): js.Promise[T] = js.native
  @JSName("apply")
  def apply_babel(`extension`: babel, config: js.Object, args: Any): js.Promise[TransformOptions] = js.native
  @JSName("apply")
  def apply_core(`extension`: core, config: js.Object, args: Any): js.Promise[CoreConfig] = js.native
  @JSName("apply")
  def apply_entries(`extension`: entries, config: js.Array[Any], args: Any): js.Promise[Any] = js.native
  @JSName("apply")
  def apply_managerEntries(`extension`: managerEntries, config: js.Array[Any], args: Any): js.Promise[js.Array[String]] = js.native
  @JSName("apply")
  def apply_managerWebpack(`extension`: managerWebpack, config: js.Object, args: OptionsbabelOptionsTransf): js.Promise[Configuration] = js.native
  @JSName("apply")
  def apply_refs(`extension`: refs, config: js.Array[Any], args: Any): js.Promise[Any] = js.native
  @JSName("apply")
  def apply_stories(`extension`: stories, config: js.Array[Any], args: Any): js.Promise[js.Array[StoriesEntry]] = js.native
  @JSName("apply")
  def apply_typescript(`extension`: typescript, config: TypescriptConfig): js.Promise[TypescriptConfig] = js.native
  @JSName("apply")
  def apply_typescript(`extension`: typescript, config: TypescriptConfig, args: Options): js.Promise[TypescriptConfig] = js.native
  @JSName("apply")
  def apply_webpack(`extension`: webpack, config: js.Object, args: BabelOptions & Any): js.Promise[Configuration] = js.native
}
