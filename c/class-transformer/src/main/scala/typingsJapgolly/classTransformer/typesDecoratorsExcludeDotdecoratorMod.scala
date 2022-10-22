package typingsJapgolly.classTransformer

import typingsJapgolly.classTransformer.typesInterfacesDecoratorOptionsExcludeOptionsDotinterfaceMod.ExcludeOptions
import typingsJapgolly.std.ClassDecorator
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorsExcludeDotdecoratorMod {
  
  @JSImport("class-transformer/types/decorators/exclude.decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Exclude(): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")().asInstanceOf[PropertyDecorator & ClassDecorator]
  inline def Exclude(options: ExcludeOptions): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & ClassDecorator]
}
