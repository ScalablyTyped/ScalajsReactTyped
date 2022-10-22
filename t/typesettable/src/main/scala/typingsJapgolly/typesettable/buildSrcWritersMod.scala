package typingsJapgolly.typesettable

import typingsJapgolly.typesettable.anon.KinIXAlignnumber
import typingsJapgolly.typesettable.anon.KinIYAlignnumber
import typingsJapgolly.typesettable.buildSrcContextsMod.IPenFactoryContext
import typingsJapgolly.typesettable.buildSrcMeasurersMod.AbstractMeasurer
import typingsJapgolly.typesettable.buildSrcWrappersMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcWritersMod {
  
  @JSImport("typesettable/build/src/writers", "Writer")
  @js.native
  open class Writer protected ()
    extends typingsJapgolly.typesettable.buildSrcWritersWriterMod.Writer {
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[Any]) = this()
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[Any], _wrapper: Wrapper) = this()
  }
  /* static members */
  object Writer {
    
    @JSImport("typesettable/build/src/writers", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/writers", "Writer.SupportedRotation")
    @js.native
    def SupportedRotation: Any = js.native
    inline def SupportedRotation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SupportedRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable/build/src/writers", "Writer.XOffsetFactor")
    @js.native
    def XOffsetFactor: KinIXAlignnumber = js.native
    inline def XOffsetFactor_=(x: KinIXAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XOffsetFactor")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable/build/src/writers", "Writer.YOffsetFactor")
    @js.native
    def YOffsetFactor: KinIYAlignnumber = js.native
    inline def YOffsetFactor_=(x: KinIYAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YOffsetFactor")(x.asInstanceOf[js.Any])
  }
}
