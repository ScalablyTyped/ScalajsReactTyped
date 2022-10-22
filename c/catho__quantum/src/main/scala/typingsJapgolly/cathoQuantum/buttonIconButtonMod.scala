package typingsJapgolly.cathoQuantum

import typingsJapgolly.cathoQuantum.anon.ColorsComponents
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.secondary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.small
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xsmall
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonIconButtonMod {
  
  type IconButton = ComponentType[IconButtonProps]
  
  trait IconButtonProps extends StObject {
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
    
    var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.undefined
    
    var theme: js.UndefOr[ColorsComponents] = js.undefined
  }
  object IconButtonProps {
    
    inline def apply(): IconButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconButtonProps]
    }
    
    extension [Self <: IconButtonProps](x: Self) {
      
      inline def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: neutral | primary | secondary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: ColorsComponents): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
