package typingsJapgolly.reactIntl

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.ReactPortal
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsMessageMod extends Shortcut {
  
  @JSImport("react-intl/src/components/message", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[
    Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | Element | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[Node, Node]) | Null
        ]
      ]
    ]
  ] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessageDescriptor * / any */ trait Props[V /* <: Record[String, Any] */] extends StObject {
    
    var children: js.UndefOr[js.Function1[/* nodes */ js.Array[Node], Element | Null]] = js.undefined
    
    var ignoreTag: js.UndefOr[Boolean] = js.undefined
    
    var tagName: js.UndefOr[ElementType] = js.undefined
    
    var values: js.UndefOr[V] = js.undefined
  }
  object Props {
    
    inline def apply[V /* <: Record[String, Any] */](): Props[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[V]]
    }
    
    extension [Self <: Props[?], V /* <: Record[String, Any] */](x: Self & Props[V]) {
      
      inline def setChildren(value: /* nodes */ js.Array[Node] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIgnoreTag(value: Boolean): Self = StObject.set(x, "ignoreTag", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagUndefined: Self = StObject.set(x, "ignoreTag", js.undefined)
      
      inline def setTagName(value: ElementType): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setValues(value: V): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type _To = NamedExoticComponent[
    Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | Element | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[Node, Node]) | Null
        ]
      ]
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsMessageMod.foo` */
  override def _to: NamedExoticComponent[
    Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | Element | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[Node, Node]) | Null
        ]
      ]
    ]
  ] = default
}
