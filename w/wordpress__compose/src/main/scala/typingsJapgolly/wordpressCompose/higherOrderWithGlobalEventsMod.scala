package typingsJapgolly.wordpressCompose

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.wordpressCompose.anon.kinkeyofWindowEventMapstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithGlobalEventsMod {
  
  @JSImport("@wordpress/compose/higher-order/with-global-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  inline def default(eventMapper: kinkeyofWindowEventMapstr): js.Function1[
    /* component */ ComponentClassP[Any & js.Object], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<any, react.react.ComponentState> extends react.react.ComponentClass<infer U, react.react.ComponentState> ? react.react.ComponentType<U> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventMapper.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentClassP[Any & js.Object], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<any, react.react.ComponentState> extends react.react.ComponentClass<infer U, react.react.ComponentState> ? react.react.ComponentType<U> : never */ js.Any
  ]]
}
