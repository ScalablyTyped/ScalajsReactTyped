package typingsJapgolly.devexpressUtils

import typingsJapgolly.devexpressUtils.libTypesMod.ICloneable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassFlagMod {
  
  @JSImport("@devexpress/utils/lib/class/flag", "Flag")
  @js.native
  open class Flag ()
    extends StObject
       with ICloneable[Flag] {
    def this(initValue: Double) = this()
    
    def add(value: Double): Unit = js.native
    
    def anyOf(flags: Double*): Boolean = js.native
    
    def get(enumVal: Double): Boolean = js.native
    
    def getValue(): Double = js.native
    
    def set(enumVal: Double, newValue: Boolean): this.type = js.native
    
    /* private */ var value: Any = js.native
  }
}
