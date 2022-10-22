package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parsers extends StObject {
  
  def gexf(target: String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, Unit]): Unit
  @JSName("gexf")
  var gexf_Original: GexfParser
  
  def json(target: String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, Unit]): Unit
  @JSName("json")
  var json_Original: JsonParser
}
object Parsers {
  
  inline def apply(
    gexf: (/* target */ String, /* sigma */ Sigma, /* callback */ js.Function1[/* graph */ Sigma, Unit]) => Callback,
    json: (/* target */ String, /* sigma */ Sigma, /* callback */ js.Function1[/* graph */ Sigma, Unit]) => Callback
  ): Parsers = {
    val __obj = js.Dynamic.literal(gexf = js.Any.fromFunction3((t0: /* target */ String, t1: /* sigma */ Sigma, t2: /* callback */ js.Function1[/* graph */ Sigma, Unit]) => (gexf(t0, t1, t2)).runNow()), json = js.Any.fromFunction3((t0: /* target */ String, t1: /* sigma */ Sigma, t2: /* callback */ js.Function1[/* graph */ Sigma, Unit]) => (json(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Parsers]
  }
  
  extension [Self <: Parsers](x: Self) {
    
    inline def setGexf(
      value: (/* target */ String, /* sigma */ Sigma, /* callback */ js.Function1[/* graph */ Sigma, Unit]) => Callback
    ): Self = StObject.set(x, "gexf", js.Any.fromFunction3((t0: /* target */ String, t1: /* sigma */ Sigma, t2: /* callback */ js.Function1[/* graph */ Sigma, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setJson(
      value: (/* target */ String, /* sigma */ Sigma, /* callback */ js.Function1[/* graph */ Sigma, Unit]) => Callback
    ): Self = StObject.set(x, "json", js.Any.fromFunction3((t0: /* target */ String, t1: /* sigma */ Sigma, t2: /* callback */ js.Function1[/* graph */ Sigma, Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
