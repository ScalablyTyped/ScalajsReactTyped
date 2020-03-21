package typingsJapgolly.handsontable.mod.default

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.handsontable.mod.Handsontable.plugins.RecordTranslator
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handsontable", "plugins")
@js.native
object plugins extends js.Object {
  @js.native
  class Base ()
    extends typingsJapgolly.handsontable.mod.Handsontable.plugins.Base
       with Instantiable0[typingsJapgolly.handsontable.mod.Handsontable.plugins.Base]
       with Instantiable1[/* hotInstance */ Core, typingsJapgolly.handsontable.mod.Handsontable.plugins.Base] {
    def this(hotInstance: Core) = this()
    /* CompleteClass */
    override var enabled: Boolean = js.native
    /* CompleteClass */
    override var hot: Core = js.native
    /* CompleteClass */
    override var initialized: Boolean = js.native
    /* CompleteClass */
    override var isPluginsReady: Boolean = js.native
    /* CompleteClass */
    override var pluginName: String = js.native
    /* CompleteClass */
    override var pluginsInitializedCallback: js.Array[_] = js.native
    /* CompleteClass */
    override var t: RecordTranslator = js.native
    /* CompleteClass */
    override def addHook(name: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    /* CompleteClass */
    override def callOnPluginsReady(callback: js.Function0[Unit]): Unit = js.native
    /* CompleteClass */
    override def clearHooks(): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def disablePlugin(): Unit = js.native
    /* CompleteClass */
    override def enablePlugin(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def removeHooks(name: String): Unit = js.native
    /* CompleteClass */
    override def updatePlugin(): Unit = js.native
  }
  
  // utils for Filters
  @js.native
  object FiltersPlugin extends js.Object
  
}

