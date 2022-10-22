package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecDataMod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse
  extends StObject
     with Format {
  
  var parse: typingsJapgolly.vegaTypings.typesSpecDataMod.Parse
}
object Parse {
  
  inline def apply(parse: typingsJapgolly.vegaTypings.typesSpecDataMod.Parse): Parse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  extension [Self <: Parse](x: Self) {
    
    inline def setParse(value: typingsJapgolly.vegaTypings.typesSpecDataMod.Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
