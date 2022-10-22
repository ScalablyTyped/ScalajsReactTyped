package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libTypesMod.LineAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationLineMod {
  
  @JSImport("@antv/component/lib/annotation/line", JSImport.Default)
  @js.native
  open class default () extends LineAnnotation
  
  @js.native
  trait LineAnnotation
    extends typingsJapgolly.antvComponent.libAbstractGroupComponentMod.default[LineAnnotationCfg] {
    
    /* private */ var getLabelPoint: Any = js.native
    
    /* private */ var renderLabel: Any = js.native
    
    /* private */ var renderLine: Any = js.native
  }
}
