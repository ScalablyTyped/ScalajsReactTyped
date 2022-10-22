package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.cathoQuantum.anon.`16`
import typingsJapgolly.cathoQuantum.anon.`17`
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.button
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.circle
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.rect
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.small
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.tag
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.text
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xsmall
import typingsJapgolly.cathoQuantum.skeletonMod.SkeletonButtonProps
import typingsJapgolly.cathoQuantum.skeletonMod.SkeletonProps
import typingsJapgolly.cathoQuantum.skeletonMod.SkeletonTagProps
import typingsJapgolly.cathoQuantum.skeletonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Skeleton {
  
  object Button {
    
    @JSImport("@catho/quantum/Skeleton", "default.Button")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def size(value: xsmall | small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def theme(value: `17`): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Button.type): typingsJapgolly.cathoQuantum.components.Skeleton.Button.Builder = new typingsJapgolly.cathoQuantum.components.Skeleton.Button.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonButtonProps): typingsJapgolly.cathoQuantum.components.Skeleton.Button.Builder = new typingsJapgolly.cathoQuantum.components.Skeleton.Button.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Circle {
    
    @JSImport("@catho/quantum/Skeleton", "default.Circle")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Circle.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Tag {
    
    @JSImport("@catho/quantum/Skeleton", "default.Tag")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def size(value: xsmall | small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def theme(value: `16`): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Tag.type): typingsJapgolly.cathoQuantum.components.Skeleton.Tag.Builder = new typingsJapgolly.cathoQuantum.components.Skeleton.Tag.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonTagProps): typingsJapgolly.cathoQuantum.components.Skeleton.Tag.Builder = new typingsJapgolly.cathoQuantum.components.Skeleton.Tag.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Text {
    
    @JSImport("@catho/quantum/Skeleton", "default.Text")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def size(value: xsmall | small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def theme(value: `16`): this.type = set("theme", value.asInstanceOf[js.Any])
      
      inline def `type`(value: rect | circle | text | button | tag): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Text.type): typingsJapgolly.cathoQuantum.components.Skeleton.Text.Builder = new typingsJapgolly.cathoQuantum.components.Skeleton.Text.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonProps): typingsJapgolly.cathoQuantum.components.Skeleton.Text.Builder = new typingsJapgolly.cathoQuantum.components.Skeleton.Text.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/Skeleton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def size(value: xsmall | small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def theme(value: `16`): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: rect | circle | text | button | tag): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Skeleton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
