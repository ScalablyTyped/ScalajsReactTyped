package typingsJapgolly.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.anon.CategoriesList
import typingsJapgolly.wordpressComponents.anon.MaxItems
import typingsJapgolly.wordpressComponents.anon.OnOrderByChange
import typingsJapgolly.wordpressComponents.queryControlsMod.QueryControls.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryControlsMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/query-controls", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object QueryControls {
    
    type CategoryProps = CategoriesList | js.Object
    
    type NumberProps = MaxItems | js.Object
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.asc
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.desc
    */
    trait Order extends StObject
    object Order {
      
      inline def asc: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.asc = "asc".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.asc]
      
      inline def desc: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.desc = "desc".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.desc]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.date
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.title
    */
    trait OrderBy extends StObject
    object OrderBy {
      
      inline def date: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.date = "date".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.date]
      
      inline def title: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.title = "title".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.title]
    }
    
    type OrderProps = OnOrderByChange | js.Object
    
    type Props = CategoryProps & OrderProps & NumberProps
  }
}
