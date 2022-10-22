package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.fundamentalReact.anon.PartialLayoutGridProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapLayoutGr
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`1`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`6`
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayoutGridLayoutGridMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/LayoutGrid/LayoutGrid.LayoutGridProps> & {  displayName :'LayoutGridProps'} */
  object default {
    
    inline def apply(props: LayoutGridProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: LayoutGridProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialLayoutGridProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", "default.displayName")
    @js.native
    def displayName: js.UndefOr[
        typingsJapgolly.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String
      ] = js.native
    inline def displayName_=(
      x: js.UndefOr[
          typingsJapgolly.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapLayoutGr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait LayoutGridProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement] {
    
    var colSpan: js.UndefOr[Any] = js.undefined
    
    var cols: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var nogap: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  }
  object LayoutGridProps {
    
    inline def apply(): LayoutGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutGridProps]
    }
    
    extension [Self <: LayoutGridProps](x: Self) {
      
      inline def setColSpan(value: Any): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setCols(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setNogap(value: Boolean): Self = StObject.set(x, "nogap", value.asInstanceOf[js.Any])
      
      inline def setNogapUndefined: Self = StObject.set(x, "nogap", js.undefined)
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
