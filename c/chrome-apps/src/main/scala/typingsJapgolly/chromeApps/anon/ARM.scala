package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.`x86-32`
import typingsJapgolly.chromeApps.chromeAppsStrings.`x86-64`
import typingsJapgolly.chromeApps.chromeAppsStrings.arm_
import typingsJapgolly.chromeApps.chromeAppsStrings.mips64_
import typingsJapgolly.chromeApps.chromeAppsStrings.mips_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARM extends StObject {
  
  var ARM: arm_
  
  var MIPS: mips_
  
  var MIPS64: mips64_
  
  var X86_32: `x86-32`
  
  var X86_64: `x86-64`
}
object ARM {
  
  inline def apply(): ARM = {
    val __obj = js.Dynamic.literal(ARM = "arm", MIPS = "mips", MIPS64 = "mips64", X86_32 = "x86-32", X86_64 = "x86-64")
    __obj.asInstanceOf[ARM]
  }
  
  extension [Self <: ARM](x: Self) {
    
    inline def setARM(value: arm_): Self = StObject.set(x, "ARM", value.asInstanceOf[js.Any])
    
    inline def setMIPS(value: mips_): Self = StObject.set(x, "MIPS", value.asInstanceOf[js.Any])
    
    inline def setMIPS64(value: mips64_): Self = StObject.set(x, "MIPS64", value.asInstanceOf[js.Any])
    
    inline def setX86_32(value: `x86-32`): Self = StObject.set(x, "X86_32", value.asInstanceOf[js.Any])
    
    inline def setX86_64(value: `x86-64`): Self = StObject.set(x, "X86_64", value.asInstanceOf[js.Any])
  }
}
