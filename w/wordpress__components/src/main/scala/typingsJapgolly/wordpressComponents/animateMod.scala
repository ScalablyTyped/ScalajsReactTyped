package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.animateMod.Animate.Props
import typingsJapgolly.wordpressComponents.anon.ClassName
import typingsJapgolly.wordpressComponents.anon.Origin
import typingsJapgolly.wordpressComponents.anon.`0`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.appear
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/animate", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Animate {
    
    trait AppearProps
      extends StObject
         with BaseProps
         with Props {
      
      var options: js.UndefOr[Origin] = js.undefined
      
      @JSName("type")
      var type_AppearProps: appear
    }
    object AppearProps {
      
      inline def apply(children: ClassName => Node): AppearProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("appear")
        __obj.asInstanceOf[AppearProps]
      }
      
      extension [Self <: AppearProps](x: Self) {
        
        inline def setOptions(value: Origin): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setType(value: appear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait BaseProps extends StObject {
      
      def children(props: ClassName): Node
      
      var `type`: appear | `slide-in` | loading
    }
    object BaseProps {
      
      inline def apply(children: ClassName => Node, `type`: appear | `slide-in` | loading): BaseProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseProps]
      }
      
      extension [Self <: BaseProps](x: Self) {
        
        inline def setChildren(value: ClassName => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        inline def setType(value: appear | `slide-in` | loading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait LoadingProps
      extends StObject
         with BaseProps
         with Props {
      
      @JSName("type")
      var type_LoadingProps: loading
    }
    object LoadingProps {
      
      inline def apply(children: ClassName => Node): LoadingProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("loading")
        __obj.asInstanceOf[LoadingProps]
      }
      
      extension [Self <: LoadingProps](x: Self) {
        
        inline def setType(value: loading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.wordpressComponents.animateMod.Animate.AppearProps
      - typingsJapgolly.wordpressComponents.animateMod.Animate.SlideInProps
      - typingsJapgolly.wordpressComponents.animateMod.Animate.LoadingProps
    */
    trait Props extends StObject
    object Props {
      
      inline def AppearProps(children: ClassName => Node): typingsJapgolly.wordpressComponents.animateMod.Animate.AppearProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("appear")
        __obj.asInstanceOf[typingsJapgolly.wordpressComponents.animateMod.Animate.AppearProps]
      }
      
      inline def LoadingProps(children: ClassName => Node): typingsJapgolly.wordpressComponents.animateMod.Animate.LoadingProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("loading")
        __obj.asInstanceOf[typingsJapgolly.wordpressComponents.animateMod.Animate.LoadingProps]
      }
      
      inline def SlideInProps(children: ClassName => Node): typingsJapgolly.wordpressComponents.animateMod.Animate.SlideInProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("slide-in")
        __obj.asInstanceOf[typingsJapgolly.wordpressComponents.animateMod.Animate.SlideInProps]
      }
    }
    
    trait SlideInProps
      extends StObject
         with BaseProps
         with Props {
      
      var options: js.UndefOr[`0`] = js.undefined
      
      @JSName("type")
      var type_SlideInProps: `slide-in`
    }
    object SlideInProps {
      
      inline def apply(children: ClassName => Node): SlideInProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("slide-in")
        __obj.asInstanceOf[SlideInProps]
      }
      
      extension [Self <: SlideInProps](x: Self) {
        
        inline def setOptions(value: `0`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setType(value: `slide-in`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
