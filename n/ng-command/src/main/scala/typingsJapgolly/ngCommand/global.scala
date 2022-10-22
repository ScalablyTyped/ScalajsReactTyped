package typingsJapgolly.ngCommand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ngCommand {
    
    @JSGlobal("ngCommand")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ngCommand.Command")
    @js.native
    open class Command protected ()
      extends StObject
         with typingsJapgolly.ngCommand.ngCommand.Command {
      def this(
        $scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ Any,
        execute: js.Function0[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ Any
              ]
      ) = this()
      def this(
        $scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ Any,
        execute: js.Function0[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ Any
              ],
        canExecute: js.Function0[Boolean]
      ) = this()
      
      /**
        * Determines whether the command can execute or not.
        */
      /* CompleteClass */
      var canExecute: Boolean = js.native
      
      /**
        * Executes the command function.
        */
      /* CompleteClass */
      override def execute(): Any = js.native
      
      /**
        * Determines whether the command is currently executing.
        */
      /* CompleteClass */
      var isExecuting: Boolean = js.native
    }
    object Command {
      
      @JSGlobal("ngCommand.Command")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("ngCommand.Command.id")
      @js.native
      def id: String = js.native
      inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("ngCommand.ModuleName")
    @js.native
    def ModuleName: String = js.native
    inline def ModuleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModuleName")(x.asInstanceOf[js.Any])
  }
}
