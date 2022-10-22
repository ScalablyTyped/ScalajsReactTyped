package typingsJapgolly.babylonjs.materialsMaterialPluginEventMod

import typingsJapgolly.babylonjs.animationsAnimatableDotinterfaceMod.IAnimatable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginGetAnimatables extends StObject {
  
  var animatables: js.Array[IAnimatable]
}
object MaterialPluginGetAnimatables {
  
  inline def apply(animatables: js.Array[IAnimatable]): MaterialPluginGetAnimatables = {
    val __obj = js.Dynamic.literal(animatables = animatables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginGetAnimatables]
  }
  
  extension [Self <: MaterialPluginGetAnimatables](x: Self) {
    
    inline def setAnimatables(value: js.Array[IAnimatable]): Self = StObject.set(x, "animatables", value.asInstanceOf[js.Any])
    
    inline def setAnimatablesVarargs(value: IAnimatable*): Self = StObject.set(x, "animatables", js.Array(value*))
  }
}
