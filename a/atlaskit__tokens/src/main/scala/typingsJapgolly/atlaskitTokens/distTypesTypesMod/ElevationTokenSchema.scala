package typingsJapgolly.atlaskitTokens.distTypesTypesMod

import typingsJapgolly.atlaskitTokens.anon.SurfaceDefaultOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.atlaskitTokens.distTypesTypesMod.ShadowTokenSchema because var conflicts: elevation. Inlined  */ trait ElevationTokenSchema[BaseToken]
  extends StObject
     with SurfaceTokenSchema[BaseToken]
object ElevationTokenSchema {
  
  inline def apply[BaseToken](elevation: SurfaceDefaultOverlay[BaseToken]): ElevationTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationTokenSchema[BaseToken]]
  }
}
