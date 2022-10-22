package typingsJapgolly.emotionStyled

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait As extends StObject {
    
    var as: js.UndefOr[ElementType] = js.undefined
    
    var theme: js.UndefOr[typingsJapgolly.emotionReact.mod.Theme] = js.undefined
  }
  object As {
    
    inline def apply(): As = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As]
    }
    
    extension [Self <: As](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setTheme(value: typingsJapgolly.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Ref[C /* <: ComponentClassP[ComponentProps[C] & js.Object] */] extends StObject {
    
    var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[InstanceType[C]]] = js.undefined
  }
  object Ref {
    
    inline def apply[C /* <: ComponentClassP[ComponentProps[C] & js.Object] */](): Ref[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[C]]
    }
    
    extension [Self <: Ref[?], C /* <: ComponentClassP[ComponentProps[C] & js.Object] */](x: Self & Ref[C]) {
      
      inline def setRef(value: typingsJapgolly.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: InstanceType[C] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: InstanceType[C] | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Theme extends StObject {
    
    var theme: js.UndefOr[typingsJapgolly.emotionReact.mod.Theme] = js.undefined
  }
  object Theme {
    
    inline def apply(): Theme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setTheme(value: typingsJapgolly.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ThemeTheme extends StObject {
    
    var theme: typingsJapgolly.emotionReact.mod.Theme
  }
  object ThemeTheme {
    
    inline def apply(theme: typingsJapgolly.emotionReact.mod.Theme): ThemeTheme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeTheme]
    }
    
    extension [Self <: ThemeTheme](x: Self) {
      
      inline def setTheme(value: typingsJapgolly.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
