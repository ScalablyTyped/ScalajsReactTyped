package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.Gutter
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.secondary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xxlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xxxlarge
import typingsJapgolly.cathoQuantum.circularLoaderMod.CircularLoaderProps
import typingsJapgolly.cathoQuantum.circularLoaderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircularLoader {
  
  @JSImport("@catho/quantum/CircularLoader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def size(value: medium | large | xlarge | xxlarge | xxxlarge): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: primary | secondary): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def theme(value: Gutter): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CircularLoader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CircularLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
