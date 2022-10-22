package typingsJapgolly.kbar

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKbaranimatorMod {
  
  @JSImport("kbar/lib/KBarAnimator", "KBarAnimator")
  @js.native
  val KBarAnimator: FC[PropsWithChildren[KBarAnimatorProps]] = js.native
  
  trait KBarAnimatorProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object KBarAnimatorProps {
    
    inline def apply(): KBarAnimatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KBarAnimatorProps]
    }
    
    extension [Self <: KBarAnimatorProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
