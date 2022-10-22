package typingsJapgolly.manaSyringe

import typingsJapgolly.inversify.anon.Constructor
import typingsJapgolly.inversify.libAnnotationDecoratorUtilsMod.DecoratorTarget
import typingsJapgolly.manaSyringe.anon.PartialTokenOption
import typingsJapgolly.manaSyringe.libContributionContributionProtocolMod.Option
import typingsJapgolly.manaSyringe.libCoreMod.Decorator
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.DecoratorOption
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.InjectOption
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.MaybeArray
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Module
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Named
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Register
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Registry
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Token
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.UnionToken
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import typingsJapgolly.std.Map
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.ParameterDecorator
import typingsJapgolly.std.Record
import typingsJapgolly.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mana-syringe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mana-syringe", "Container")
  @js.native
  open class Container ()
    extends typingsJapgolly.manaSyringe.libContainerMod.Container {
    def this(inversifyContainer: typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Container) = this()
  }
  /* static members */
  object Container {
    
    @JSImport("mana-syringe", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    inline def config(option: InjectOption[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getContainer(key: typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Container): typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")(key.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container]
    
    inline def setContainer(
      key: typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Container,
      value: typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container
    ): Map[Double, typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContainer")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Map[Double, typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container]]
  }
  
  object Contribution {
    
    @JSImport("mana-syringe", "Contribution")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mana-syringe", "Contribution.Provider")
    @js.native
    val Provider: DefinedToken = js.native
    
    /* was `typeof contributionRegister` */
    inline def register(registerMethod: Register, identifier: typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(
      registerMethod: Register,
      identifier: typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken,
      option: Option
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("mana-syringe", "DefaultContributionProvider")
  @js.native
  open class DefaultContributionProvider[T /* <: Record[String, Any] */] protected ()
    extends typingsJapgolly.manaSyringe.libContributionMod.DefaultContributionProvider[T] {
    def this(serviceIdentifier: Token[T], container: typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container) = this()
    def this(
      serviceIdentifier: Token[T],
      container: typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container,
      option: Option
    ) = this()
  }
  
  @JSImport("mana-syringe", "GlobalContainer")
  @js.native
  val GlobalContainer: typingsJapgolly.manaSyringe.libContainerMod.Container = js.native
  
  inline def Module(): typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")().asInstanceOf[typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule]
  inline def Module(register: Registry): typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")(register.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule]
  
  @JSImport("mana-syringe", "OptionSymbol")
  @js.native
  val OptionSymbol: js.Symbol = js.native
  
  @JSImport("mana-syringe", "Provider")
  @js.native
  val Provider: typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken = js.native
  
  object Syringe {
    
    @JSImport("mana-syringe", "Syringe")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mana-syringe", "Syringe.ClassOptionSymbol")
    @js.native
    val ClassOptionSymbol: js.Symbol = js.native
    
    @JSImport("mana-syringe", "Syringe.DefaultOption")
    @js.native
    val DefaultOption: InjectOption[Any] = js.native
    
    @JSImport("mana-syringe", "Syringe.DefinedToken")
    @js.native
    open class DefinedToken protected ()
      extends typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken {
      def this(name: String) = this()
      def this(name: String, option: PartialTokenOption) = this()
    }
    
    @JSImport("mana-syringe", "Syringe.Lifecycle")
    @js.native
    object Lifecycle extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.manaSyringe.libCoreMod.Syringe.Lifecycle & String] = js.native
      
      /* "singleton" */ val singleton: typingsJapgolly.manaSyringe.libCoreMod.Syringe.Lifecycle.singleton & String = js.native
      
      /* "transient" */ val transient: typingsJapgolly.manaSyringe.libCoreMod.Syringe.Lifecycle.transient & String = js.native
    }
    
    /**
      * 定义注入标识，默认允许多重注入
      */
    inline def defineToken(name: String): typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken]
    inline def defineToken(name: String, option: PartialTokenOption): typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken]
    
    inline def isModule(): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
    inline def isModule(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
  }
  
  @JSImport("mana-syringe", "SyringeModule")
  @js.native
  open class SyringeModule ()
    extends typingsJapgolly.manaSyringe.libModuleMod.SyringeModule {
    def this(registry: Registry) = this()
  }
  
  object Utils {
    
    @JSImport("mana-syringe", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isClass(): /* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean]
    inline def isClass(data: String): /* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean]
    inline def isClass(data: js.Symbol): /* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean]
    inline def isClass(data: Record[String, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Class<any> */ Boolean]
    
    inline def isDefinedToken(): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    inline def isDefinedToken(data: String): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    inline def isDefinedToken(data: js.Symbol): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    inline def isDefinedToken(data: Double): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    inline def isDefinedToken(data: Record[String, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.DefinedToken */ Boolean]
    
    inline def isInjectOption[T](): /* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectOption")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean]
    inline def isInjectOption[T](data: InjectOption[T]): /* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectOption")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean]
    inline def isInjectOption[T](data: Token[T]): /* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectOption")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.InjectOption<T> */ Boolean]
    
    inline def isMultipleEnabled[T](token: Token[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultipleEnabled")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNamedToken[T](): /* is mana-syringe.mana-syringe/lib/core.Syringe.NamedToken<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedToken")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.NamedToken<T> */ Boolean]
    inline def isNamedToken[T](data: UnionToken[T]): /* is mana-syringe.mana-syringe/lib/core.Syringe.NamedToken<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedToken")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.NamedToken<T> */ Boolean]
    
    inline def toArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[T]]
    inline def toArray[T](maybeArray: MaybeArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  }
  
  inline def contrib(token: Named): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("contrib")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inject(token: Token[Any]): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def injectable[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")().asInstanceOf[Decorator[T]]
  inline def injectable[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def isSyringeModule(data: Module): /* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyringeModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean]
  
  inline def named(name: Named): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
  
  inline def optional(): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def postConstruct(): js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("postConstruct")().asInstanceOf[js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit]]
  
  @JSImport("mana-syringe", "register")
  @js.native
  val register: Register = js.native
  
  inline def registerSideOption[T /* <: Record[Any, Any] */, R](option: InjectOption[R], target: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSideOption")(option.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def singleton[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[Decorator[T]]
  inline def singleton[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def transient[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transient")().asInstanceOf[Decorator[T]]
  inline def transient[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transient")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]
  
  inline def unmanaged(): js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmanaged")().asInstanceOf[js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit]]
}
