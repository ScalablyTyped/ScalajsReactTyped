package typingsJapgolly.typeformEmbed

import org.scalajs.dom.HTMLElement
import typingsJapgolly.typeformEmbed.typeformEmbedStrings.left
import typingsJapgolly.typeformEmbed.typeformEmbedStrings.right
import typingsJapgolly.typeformEmbed.typesBaseActionableOptionsMod.ActionableOptions
import typingsJapgolly.typeformEmbed.typesBaseBaseOptionsMod.BaseOptions
import typingsJapgolly.typeformEmbed.typesBaseBehavioralOptionsMod.BehavioralOptions
import typingsJapgolly.typeformEmbed.typesBaseIframeOptionsMod.IframeOptions
import typingsJapgolly.typeformEmbed.typesBaseSizeableOptionsMod.WidthOption
import typingsJapgolly.typeformEmbed.typesBaseUrlOptionsMod.UrlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFactoriesCreateSliderSliderOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.typeformEmbed.typesBaseModalWindowOptionsMod.ModalWindowOptions because var conflicts: keepSession. Inlined container, autoClose */ trait SliderOptions
    extends StObject
       with BaseOptions
       with UrlOptions
       with ActionableOptions
       with BehavioralOptions
       with WidthOption
       with IframeOptions {
    
    /**
      * Time (ms) until the embedded typeform will automatically close after a respondent clicks the Submit button.
      *
      * @type {number|boolean}
      */
    var autoClose: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * Element to place the modal window into. Optional.
      *
      * @type {HTMLElement}
      */
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Slider position. Indicates from which side of the screen it will open.
      *
      * @type 'right' | 'left'
      */
    var position: js.UndefOr[right | left] = js.undefined
  }
  object SliderOptions {
    
    inline def apply(): SliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderOptions]
    }
    
    extension [Self <: SliderOptions](x: Self) {
      
      inline def setAutoClose(value: Double | Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setPosition(value: right | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
