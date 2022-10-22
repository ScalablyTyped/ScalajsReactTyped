package typingsJapgolly.cypressAxe

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import typingsJapgolly.axeCore.mod.ContextObject
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.axeCore.mod.RunOptions
import typingsJapgolly.cypressAxe.anon.Typeofaxe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cypress-axe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureAxe(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureAxe")().asInstanceOf[Unit]
  inline def configureAxe(configurationOptions: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureAxe")(configurationOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def injectAxe(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectAxe")().asInstanceOf[Unit]
  
  trait Options
    extends StObject
       with RunOptions {
    
    var includedImpacts: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludedImpacts(value: js.Array[String]): Self = StObject.set(x, "includedImpacts", value.asInstanceOf[js.Any])
      
      inline def setIncludedImpactsUndefined: Self = StObject.set(x, "includedImpacts", js.undefined)
      
      inline def setIncludedImpactsVarargs(value: String*): Self = StObject.set(x, "includedImpacts", js.Array(value*))
    }
  }
  
  object global {
    
    object Cypress {
      
      trait Chainable extends StObject {
        
        def checkA11y(): Unit
        def checkA11y(context: String): Unit
        def checkA11y(
          context: String,
          options: Unit,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit]
        ): Unit
        def checkA11y(
          context: String,
          options: Unit,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit],
          skipFailures: Boolean
        ): Unit
        def checkA11y(context: String, options: Unit, violationCallback: Unit, skipFailures: Boolean): Unit
        def checkA11y(context: String, options: Options): Unit
        def checkA11y(
          context: String,
          options: Options,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit]
        ): Unit
        def checkA11y(
          context: String,
          options: Options,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit],
          skipFailures: Boolean
        ): Unit
        def checkA11y(context: String, options: Options, violationCallback: Unit, skipFailures: Boolean): Unit
        def checkA11y(context: Node): Unit
        def checkA11y(
          context: Node,
          options: Unit,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit]
        ): Unit
        def checkA11y(
          context: Node,
          options: Unit,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit],
          skipFailures: Boolean
        ): Unit
        def checkA11y(context: Node, options: Unit, violationCallback: Unit, skipFailures: Boolean): Unit
        def checkA11y(context: Node, options: Options): Unit
        def checkA11y(
          context: Node,
          options: Options,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit]
        ): Unit
        def checkA11y(
          context: Node,
          options: Options,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit],
          skipFailures: Boolean
        ): Unit
        def checkA11y(context: Node, options: Options, violationCallback: Unit, skipFailures: Boolean): Unit
        def checkA11y(
          context: Unit,
          options: Unit,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit]
        ): Unit
        def checkA11y(
          context: Unit,
          options: Unit,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit],
          skipFailures: Boolean
        ): Unit
        def checkA11y(context: Unit, options: Unit, violationCallback: Unit, skipFailures: Boolean): Unit
        def checkA11y(context: Unit, options: Options): Unit
        def checkA11y(
          context: Unit,
          options: Options,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit]
        ): Unit
        def checkA11y(
          context: Unit,
          options: Options,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit],
          skipFailures: Boolean
        ): Unit
        def checkA11y(context: Unit, options: Options, violationCallback: Unit, skipFailures: Boolean): Unit
        def checkA11y(context: ContextObject): Unit
        def checkA11y(
          context: ContextObject,
          options: Unit,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit]
        ): Unit
        def checkA11y(
          context: ContextObject,
          options: Unit,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit],
          skipFailures: Boolean
        ): Unit
        def checkA11y(context: ContextObject, options: Unit, violationCallback: Unit, skipFailures: Boolean): Unit
        def checkA11y(context: ContextObject, options: Options): Unit
        def checkA11y(
          context: ContextObject,
          options: Options,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit]
        ): Unit
        def checkA11y(
          context: ContextObject,
          options: Options,
          violationCallback: js.Function1[/* violations */ js.Array[Result], Unit],
          skipFailures: Boolean
        ): Unit
        def checkA11y(context: ContextObject, options: Options, violationCallback: Unit, skipFailures: Boolean): Unit
        @JSName("checkA11y")
        var checkA11y_Original: js.Function4[
                /* context */ js.UndefOr[String | Node | ContextObject], 
                /* options */ js.UndefOr[Options], 
                /* violationCallback */ js.UndefOr[js.Function1[/* violations */ js.Array[Result], Unit]], 
                /* skipFailures */ js.UndefOr[Boolean], 
                Unit
              ]
        
        def configureAxe(): Unit
        def configureAxe(configurationOptions: js.Object): Unit
        @JSName("configureAxe")
        var configureAxe_Original: js.Function1[/* configurationOptions */ js.UndefOr[js.Object], Unit]
        
        def injectAxe(): Unit
        @JSName("injectAxe")
        var injectAxe_Original: js.Function0[Unit]
      }
      object Chainable {
        
        inline def apply(
          checkA11y: (/* context */ js.UndefOr[String | Node | ContextObject], /* options */ js.UndefOr[Options], /* violationCallback */ js.UndefOr[js.Function1[/* violations */ js.Array[Result], Unit]], /* skipFailures */ js.UndefOr[Boolean]) => Callback,
          configureAxe: /* configurationOptions */ js.UndefOr[js.Object] => Callback,
          injectAxe: Callback
        ): Chainable = {
          val __obj = js.Dynamic.literal(checkA11y = js.Any.fromFunction4((t0: /* context */ js.UndefOr[String | Node | ContextObject], t1: /* options */ js.UndefOr[Options], t2: /* violationCallback */ js.UndefOr[js.Function1[/* violations */ js.Array[Result], Unit]], t3: /* skipFailures */ js.UndefOr[Boolean]) => (checkA11y(t0, t1, t2, t3)).runNow()), configureAxe = js.Any.fromFunction1((t0: /* configurationOptions */ js.UndefOr[js.Object]) => configureAxe(t0).runNow()), injectAxe = injectAxe.toJsFn)
          __obj.asInstanceOf[Chainable]
        }
        
        extension [Self <: Chainable](x: Self) {
          
          inline def setCheckA11y(
            value: (/* context */ js.UndefOr[String | Node | ContextObject], /* options */ js.UndefOr[Options], /* violationCallback */ js.UndefOr[js.Function1[/* violations */ js.Array[Result], Unit]], /* skipFailures */ js.UndefOr[Boolean]) => Callback
          ): Self = StObject.set(x, "checkA11y", js.Any.fromFunction4((t0: /* context */ js.UndefOr[String | Node | ContextObject], t1: /* options */ js.UndefOr[Options], t2: /* violationCallback */ js.UndefOr[js.Function1[/* violations */ js.Array[Result], Unit]], t3: /* skipFailures */ js.UndefOr[Boolean]) => (value(t0, t1, t2, t3)).runNow()))
          
          inline def setConfigureAxe(value: /* configurationOptions */ js.UndefOr[js.Object] => Callback): Self = StObject.set(x, "configureAxe", js.Any.fromFunction1((t0: /* configurationOptions */ js.UndefOr[js.Object]) => value(t0).runNow()))
          
          inline def setInjectAxe(value: Callback): Self = StObject.set(x, "injectAxe", value.toJsFn)
        }
      }
    }
    
    trait Window extends StObject {
      
      var axe: Typeofaxe
    }
    object Window {
      
      inline def apply(axe: Typeofaxe): Window = {
        val __obj = js.Dynamic.literal(axe = axe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setAxe(value: Typeofaxe): Self = StObject.set(x, "axe", value.asInstanceOf[js.Any])
      }
    }
  }
}
