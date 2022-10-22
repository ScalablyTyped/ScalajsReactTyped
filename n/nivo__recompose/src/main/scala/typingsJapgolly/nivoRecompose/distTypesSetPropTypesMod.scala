package typingsJapgolly.nivoRecompose

import typingsJapgolly.propTypes.mod.ValidationMap
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetPropTypesMod {
  
  @JSImport("@nivo/recompose/dist/types/setPropTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setPropTypes[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPropTypes")(propTypes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], ComponentType[P]]]
}
