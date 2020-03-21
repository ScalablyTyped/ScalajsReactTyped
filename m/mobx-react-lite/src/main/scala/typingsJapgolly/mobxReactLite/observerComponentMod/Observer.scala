package typingsJapgolly.mobxReactLite.observerComponentMod

import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/ObserverComponent", "Observer")
@js.native
object Observer extends js.Object {
  var displayName: String = js.native
  def apply(hasChildrenRender: IObserverProps): Element | Null = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Function5[
        /* props */ StringDictionary[js.Any], 
        /* key */ String, 
        /* componentName */ String, 
        /* location */ js.Any, 
        /* propFullName */ String, 
        js.Error | Null
      ] = js.native
    var render: js.Function5[
        /* props */ StringDictionary[js.Any], 
        /* key */ String, 
        /* componentName */ String, 
        /* location */ js.Any, 
        /* propFullName */ String, 
        js.Error | Null
      ] = js.native
  }
  
}

