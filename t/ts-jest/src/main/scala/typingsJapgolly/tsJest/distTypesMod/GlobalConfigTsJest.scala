package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.tsJest.distTypesMod.jestTypesAugmentingMod.Config.ConfigGlobals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalConfigTsJest
  extends StObject
     with ConfigGlobals
object GlobalConfigTsJest {
  
  inline def apply(`ts-jest`: TsJestGlobalOptions): GlobalConfigTsJest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ts-jest")(`ts-jest`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfigTsJest]
  }
}
