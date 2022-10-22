package typingsJapgolly.three

import typingsJapgolly.three.srcConstantsMod.Usage
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreEventDispatcherMod.EventDispatcher
import typingsJapgolly.three.srcCoreUniformMod.Uniform
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreUniformsGroupMod {
  
  @JSImport("three/src/core/UniformsGroup", "UniformsGroup")
  @js.native
  open class UniformsGroup () extends EventDispatcher[Event] {
    
    def add(uniform: Uniform): this.type = js.native
    
    def copy(source: UniformsGroup): this.type = js.native
    
    def dispose(): this.type = js.native
    
    var id: Double = js.native
    
    var isUniformsGroup: `true` = js.native
    
    def remove(uniform: Uniform): this.type = js.native
    
    def setName(name: String): this.type = js.native
    
    def setUsage(value: Usage): this.type = js.native
    
    var uniforms: js.Array[Uniform] = js.native
    
    var usage: Usage = js.native
  }
}
