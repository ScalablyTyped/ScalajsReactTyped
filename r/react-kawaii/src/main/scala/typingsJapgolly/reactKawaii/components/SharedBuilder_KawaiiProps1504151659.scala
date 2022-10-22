package typingsJapgolly.reactKawaii.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactKawaii.mod.KawaiiMood
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_KawaiiProps1504151659 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def mood(value: KawaiiMood): this.type = set("mood", value.asInstanceOf[js.Any])
  
  inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
}
