package typingsJapgolly.mobservable

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mobservable.coreMod.ValueMode
import typingsJapgolly.mobservable.dnodeMod.DataNode
import typingsJapgolly.mobservable.interfacesMod.IContextInfoStruct
import typingsJapgolly.mobservable.interfacesMod.IObjectChange
import typingsJapgolly.mobservable.interfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/observableobject", JSImport.Namespace)
@js.native
object observableobjectMod extends js.Object {
  @js.native
  class ObservableObject protected () extends js.Object {
    def this(target: js.Any, context: IContextInfoStruct, mode: ValueMode) = this()
    var _events: js.Any = js.native
    var context: js.Any = js.native
    var mode: js.Any = js.native
    var target: js.Any = js.native
    var values: StringDictionary[DataNode] = js.native
    /* private */ def defineReactiveProperty(propName: js.Any, value: js.Any): js.Any = js.native
    def observe(callback: js.Function1[/* changes */ IObjectChange[_, _], Unit]): Lambda = js.native
    def set(propName: js.Any, value: js.Any): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ObservableObject extends js.Object {
    def asReactive(target: js.Any, context: IContextInfoStruct, mode: ValueMode): ObservableObject = js.native
  }
  
}

