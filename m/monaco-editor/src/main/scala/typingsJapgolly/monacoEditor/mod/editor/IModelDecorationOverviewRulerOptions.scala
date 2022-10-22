package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelDecorationOverviewRulerOptions
  extends StObject
     with IDecorationOptions {
  
  /**
    * The position in the overview ruler.
    */
  var position: OverviewRulerLane
}
object IModelDecorationOverviewRulerOptions {
  
  inline def apply(position: OverviewRulerLane): IModelDecorationOverviewRulerOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationOverviewRulerOptions]
  }
  
  extension [Self <: IModelDecorationOverviewRulerOptions](x: Self) {
    
    inline def setPosition(value: OverviewRulerLane): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
