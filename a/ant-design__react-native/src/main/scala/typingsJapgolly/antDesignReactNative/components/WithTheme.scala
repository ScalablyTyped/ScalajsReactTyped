package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WithTheme {
  
  inline def apply[T, S](children: (T & StringDictionary[Any], Theme) => Node): Builder[T, S] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new Builder[T, S](js.Array(this.component, __props.asInstanceOf[WithThemeProps[T, S]]))
  }
  
  @JSImport("@ant-design/react-native/lib/style", "WithTheme")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T, S] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def styles(value: S & StringDictionary[Any]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def themeStyles(value: /* theme */ Theme => T): this.type = set("themeStyles", js.Any.fromFunction1(value))
  }
  
  def withProps[T, S](p: WithThemeProps[T, S]): Builder[T, S] = new Builder[T, S](js.Array(this.component, p.asInstanceOf[js.Any]))
}
