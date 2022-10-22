package typingsJapgolly.swiper

import typingsJapgolly.svelte.mod.SvelteComponentTyped
import typingsJapgolly.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typingsJapgolly.swiper.anon.ActiveIndexChange
import typingsJapgolly.swiper.anon.Containerend
import typingsJapgolly.swiper.anon.Default
import typingsJapgolly.swiper.typesSwiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svelteSwiperSvelteMod {
  
  @JSImport("swiper/svelte/swiper-svelte", "Swiper")
  @js.native
  open class Swiper protected () extends SvelteComponentTyped[SwiperProps, ActiveIndexChange, Containerend] {
    def this(options: ComponentConstructorOptions[SwiperProps]) = this()
  }
  
  @JSImport("swiper/svelte/swiper-svelte", "SwiperSlide")
  @js.native
  open class SwiperSlide protected ()
    extends SvelteComponentTyped[SwiperSlideProps, js.Object, Default] {
    def this(options: ComponentConstructorOptions[SwiperSlideProps]) = this()
  }
  
  // @ts-ignore
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify svelte.JSX.HTMLAttributes<HTMLElementTagNameMap['div']> * / any */ trait SwiperProps
    extends StObject
       with SwiperOptions
  object SwiperProps {
    
    inline def apply(): SwiperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperProps]
    }
  }
  
  // @ts-ignore
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify svelte.JSX.HTMLAttributes<HTMLElementTagNameMap['div']> * / any */ trait SwiperSlideProps extends StObject {
    
    /**
      * Slide's index in slides array/collection
      *
      * @default false
      */
    var virtualIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables additional wrapper required for zoom mode
      *
      * @default false
      */
    var zoom: js.UndefOr[Boolean] = js.undefined
  }
  object SwiperSlideProps {
    
    inline def apply(): SwiperSlideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperSlideProps]
    }
    
    extension [Self <: SwiperSlideProps](x: Self) {
      
      inline def setVirtualIndex(value: Double): Self = StObject.set(x, "virtualIndex", value.asInstanceOf[js.Any])
      
      inline def setVirtualIndexUndefined: Self = StObject.set(x, "virtualIndex", js.undefined)
      
      inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
