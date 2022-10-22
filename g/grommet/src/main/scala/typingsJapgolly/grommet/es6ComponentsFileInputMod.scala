package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.grommet.anon.AggregateThreshold
import typingsJapgolly.grommet.anon.Browse
import typingsJapgolly.grommet.anon.Files
import typingsJapgolly.grommet.anon.OnCancel
import typingsJapgolly.grommet.anon.Target
import typingsJapgolly.grommet.grommetStrings.multiple
import typingsJapgolly.grommet.grommetStrings.onChange
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsFileInputMod {
  
  @JSImport("grommet/es6/components/FileInput", "FileInput")
  @js.native
  val FileInput: FC[FileInputExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'multiple' | 'onChange'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait FileInputExtendedProps
    extends StObject
       with FileInputProps
  object FileInputExtendedProps {
    
    inline def apply(): FileInputExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileInputExtendedProps]
    }
  }
  
  trait FileInputProps extends StObject {
    
    var confirmRemove: js.UndefOr[js.Function1[/* hasOnConfirmOnCancel */ OnCancel, Element]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var messages: js.UndefOr[Browse] = js.undefined
    
    var multiple: js.UndefOr[Boolean | AggregateThreshold] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]], 
          /* hasFiles */ js.UndefOr[Files], 
          /* hasTarget */ js.UndefOr[Target], 
          Unit
        ]
      ] = js.undefined
    
    var renderFile: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  }
  object FileInputProps {
    
    inline def apply(): FileInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileInputProps]
    }
    
    extension [Self <: FileInputProps](x: Self) {
      
      inline def setConfirmRemove(value: /* hasOnConfirmOnCancel */ OnCancel => Element): Self = StObject.set(x, "confirmRemove", js.Any.fromFunction1(value))
      
      inline def setConfirmRemoveUndefined: Self = StObject.set(x, "confirmRemove", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMessages(value: Browse): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMultiple(value: Boolean | AggregateThreshold): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]], /* hasFiles */ js.UndefOr[Files], /* hasTarget */ js.UndefOr[Target]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]], t1: /* hasFiles */ js.UndefOr[Files], t2: /* hasTarget */ js.UndefOr[Target]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRenderFile(value: /* repeated */ Any => Callback): Self = StObject.set(x, "renderFile", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setRenderFileUndefined: Self = StObject.set(x, "renderFile", js.undefined)
    }
  }
  
  type inputProps = Omit[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    multiple | onChange
  ]
}
