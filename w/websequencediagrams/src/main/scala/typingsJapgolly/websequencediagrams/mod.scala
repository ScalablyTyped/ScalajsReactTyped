package typingsJapgolly.websequencediagrams

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("websequencediagrams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @async */
  inline def diagram(message: String): js.Promise[DiagramTuple] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: String, style: Unit, format: OutputType): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: String, style: Style): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: String, style: Style, format: OutputType): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: Buffer): js.Promise[DiagramTuple] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: Buffer, style: Unit, format: OutputType): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: Buffer, style: Style): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: Buffer, style: Style, format: OutputType): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  
  /** @async */
  inline def diagramURL(message: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: String, style: Unit, format: OutputType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: String, style: Style): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: String, style: Style, format: OutputType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: Buffer, style: Unit, format: OutputType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: Buffer, style: Style): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: Buffer, style: Style, format: OutputType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("websequencediagrams", "root")
  @js.native
  def root: String = js.native
  inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  
  @JSImport("websequencediagrams", "styles")
  @js.native
  def styles: js.Array[Style] = js.native
  inline def styles_=(x: js.Array[Style]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
  
  type DiagramTuple = js.Tuple2[Buffer, String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.png
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.svg
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.pdf
  */
  trait OutputType extends StObject
  object OutputType {
    
    inline def pdf: typingsJapgolly.websequencediagrams.websequencediagramsStrings.pdf = "pdf".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.pdf]
    
    inline def png: typingsJapgolly.websequencediagrams.websequencediagramsStrings.png = "png".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.png]
    
    inline def svg: typingsJapgolly.websequencediagrams.websequencediagramsStrings.svg = "svg".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.svg]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.default
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.earth
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.magazine
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.`modern-blue`
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.mscgenComma
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.napkin
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.omegapple
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.patent
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.qsd
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.rose
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.roundgreen
    - typingsJapgolly.websequencediagrams.websequencediagramsStrings.vs2010
  */
  trait Style extends StObject
  object Style {
    
    inline def default: typingsJapgolly.websequencediagrams.websequencediagramsStrings.default = "default".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.default]
    
    inline def earth: typingsJapgolly.websequencediagrams.websequencediagramsStrings.earth = "earth".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.earth]
    
    inline def magazine: typingsJapgolly.websequencediagrams.websequencediagramsStrings.magazine = "magazine".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.magazine]
    
    inline def `modern-blue`: typingsJapgolly.websequencediagrams.websequencediagramsStrings.`modern-blue` = "modern-blue".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.`modern-blue`]
    
    inline def mscgenComma: typingsJapgolly.websequencediagrams.websequencediagramsStrings.mscgenComma = "mscgen,".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.mscgenComma]
    
    inline def napkin: typingsJapgolly.websequencediagrams.websequencediagramsStrings.napkin = "napkin".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.napkin]
    
    inline def omegapple: typingsJapgolly.websequencediagrams.websequencediagramsStrings.omegapple = "omegapple".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.omegapple]
    
    inline def patent: typingsJapgolly.websequencediagrams.websequencediagramsStrings.patent = "patent".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.patent]
    
    inline def qsd: typingsJapgolly.websequencediagrams.websequencediagramsStrings.qsd = "qsd".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.qsd]
    
    inline def rose: typingsJapgolly.websequencediagrams.websequencediagramsStrings.rose = "rose".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.rose]
    
    inline def roundgreen: typingsJapgolly.websequencediagrams.websequencediagramsStrings.roundgreen = "roundgreen".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.roundgreen]
    
    inline def vs2010: typingsJapgolly.websequencediagrams.websequencediagramsStrings.vs2010 = "vs2010".asInstanceOf[typingsJapgolly.websequencediagrams.websequencediagramsStrings.vs2010]
  }
}
