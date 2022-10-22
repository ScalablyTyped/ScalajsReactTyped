package typingsJapgolly.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutBindingHandlers extends StObject {
  
  var alert: AlertKnockoutBindingHandler
  
  var carousel: CarouselKnockoutBindingHandler
  
  var checkbox: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
  
  var modal: ModalKnockoutBindingHandler
  
  var popover: PopoverKnockoutBindingHandler
  
  var progress: ProgressKnockoutBindingHandler
  
  var radio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
  
  var toggle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
  
  var tooltip: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
}
object KnockoutBindingHandlers {
  
  inline def apply(
    alert: AlertKnockoutBindingHandler,
    carousel: CarouselKnockoutBindingHandler,
    checkbox: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any,
    modal: ModalKnockoutBindingHandler,
    popover: PopoverKnockoutBindingHandler,
    progress: ProgressKnockoutBindingHandler,
    radio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any,
    toggle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any,
    tooltip: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], carousel = carousel.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], popover = popover.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  
  extension [Self <: KnockoutBindingHandlers](x: Self) {
    
    inline def setAlert(value: AlertKnockoutBindingHandler): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setCarousel(value: CarouselKnockoutBindingHandler): Self = StObject.set(x, "carousel", value.asInstanceOf[js.Any])
    
    inline def setCheckbox(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
    ): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setModal(value: ModalKnockoutBindingHandler): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setPopover(value: PopoverKnockoutBindingHandler): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: ProgressKnockoutBindingHandler): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setRadio(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
    ): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setToggle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
    ): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setTooltip(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ Any
    ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
