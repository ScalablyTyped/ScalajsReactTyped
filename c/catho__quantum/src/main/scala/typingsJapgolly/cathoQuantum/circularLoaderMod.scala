package typingsJapgolly.cathoQuantum

import typingsJapgolly.cathoQuantum.anon.Gutter
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.secondary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xxlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xxxlarge
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularLoaderMod {
  
  @JSImport("@catho/quantum/CircularLoader", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CircularLoaderProps, js.Object, Any]
  
  type CircularLoader = japgolly.scalajs.react.facade.React.Component[CircularLoaderProps & js.Object, js.Object]
  
  trait CircularLoaderProps extends StObject {
    
    var size: js.UndefOr[medium | large | xlarge | xxlarge | xxxlarge] = js.undefined
    
    var skin: js.UndefOr[primary | secondary] = js.undefined
    
    var theme: js.UndefOr[Gutter] = js.undefined
  }
  object CircularLoaderProps {
    
    inline def apply(): CircularLoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularLoaderProps]
    }
    
    extension [Self <: CircularLoaderProps](x: Self) {
      
      inline def setSize(value: medium | large | xlarge | xxlarge | xxxlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: primary | secondary): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: Gutter): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
