package typingsJapgolly.reactImageMagnify.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageMagnify.anon.Height
import typingsJapgolly.reactImageMagnify.anon.ReactImageMagnifyPropsRea
import typingsJapgolly.reactImageMagnify.mod.LargeImageType
import typingsJapgolly.reactImageMagnify.mod.SmallImageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImageMagnify {
  
  inline def apply(largeImage: LargeImageType, smallImage: SmallImageType): Builder = {
    val __props = js.Dynamic.literal(largeImage = largeImage.asInstanceOf[js.Any], smallImage = smallImage.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactImageMagnifyPropsRea]))
  }
  
  @JSImport("react-image-magnify", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def enlargedImageClassName(value: String): this.type = set("enlargedImageClassName", value.asInstanceOf[js.Any])
    
    inline def enlargedImageContainerClassName(value: String): this.type = set("enlargedImageContainerClassName", value.asInstanceOf[js.Any])
    
    inline def enlargedImageContainerDimensions(value: Height): this.type = set("enlargedImageContainerDimensions", value.asInstanceOf[js.Any])
    
    inline def enlargedImageContainerStyle(value: CSSProperties): this.type = set("enlargedImageContainerStyle", value.asInstanceOf[js.Any])
    
    inline def enlargedImagePortalId(value: String): this.type = set("enlargedImagePortalId", value.asInstanceOf[js.Any])
    
    inline def enlargedImagePosition(value: String): this.type = set("enlargedImagePosition", value.asInstanceOf[js.Any])
    
    inline def enlargedImageStyle(value: CSSProperties): this.type = set("enlargedImageStyle", value.asInstanceOf[js.Any])
    
    inline def fadeDurationInMs(value: Double): this.type = set("fadeDurationInMs", value.asInstanceOf[js.Any])
    
    inline def hintComponent(value: Callback): this.type = set("hintComponent", value.toJsFn)
    
    inline def hintTextMouse(value: String): this.type = set("hintTextMouse", value.asInstanceOf[js.Any])
    
    inline def hintTextTouch(value: String): this.type = set("hintTextTouch", value.asInstanceOf[js.Any])
    
    inline def hoverDelayInMs(value: Double): this.type = set("hoverDelayInMs", value.asInstanceOf[js.Any])
    
    inline def hoverOffDelayInMs(value: Double): this.type = set("hoverOffDelayInMs", value.asInstanceOf[js.Any])
    
    inline def imageClassName(value: String): this.type = set("imageClassName", value.asInstanceOf[js.Any])
    
    inline def imageStyle(value: CSSProperties): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    
    inline def isActivatedOnTouch(value: Boolean): this.type = set("isActivatedOnTouch", value.asInstanceOf[js.Any])
    
    inline def isEnlargedImagePortalEnabledForTouch(value: Boolean): this.type = set("isEnlargedImagePortalEnabledForTouch", value.asInstanceOf[js.Any])
    
    inline def isHintEnabled(value: Boolean): this.type = set("isHintEnabled", value.asInstanceOf[js.Any])
    
    inline def lensComponent(value: Callback): this.type = set("lensComponent", value.toJsFn)
    
    inline def lensStyle(value: CSSProperties): this.type = set("lensStyle", value.asInstanceOf[js.Any])
    
    inline def pressDuration(value: Double): this.type = set("pressDuration", value.asInstanceOf[js.Any])
    
    inline def pressMoveThreshold(value: Double): this.type = set("pressMoveThreshold", value.asInstanceOf[js.Any])
    
    inline def shouldHideHintAfterFirstActivation(value: Boolean): this.type = set("shouldHideHintAfterFirstActivation", value.asInstanceOf[js.Any])
    
    inline def shouldUsePositiveSpaceLens(value: Boolean): this.type = set("shouldUsePositiveSpaceLens", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactImageMagnifyPropsRea): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
