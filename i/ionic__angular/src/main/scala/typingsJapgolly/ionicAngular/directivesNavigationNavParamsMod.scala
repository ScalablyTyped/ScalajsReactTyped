package typingsJapgolly.ionicAngular

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesNavigationNavParamsMod {
  
  @JSImport("@ionic/angular/directives/navigation/nav-params", "NavParams")
  @js.native
  open class NavParams () extends StObject {
    def this(data: StringDictionary[Any]) = this()
    
    var data: StringDictionary[Any] = js.native
    
    /**
      * Get the value of a nav-parameter for the current view
      *
      * ```ts
      * import { NavParams } from 'ionic-angular';
      *
      * export class MyClass{
      *  constructor(public navParams: NavParams){
      *    // userParams is an object we have in our nav-parameters
      *    this.navParams.get('userParams');
      *  }
      * }
      * ```
      *
      * @param param Which param you want to look up
      */
    def get[T](param: String): T = js.native
  }
}
