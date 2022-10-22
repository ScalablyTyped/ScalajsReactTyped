package typingsJapgolly.phaser.spine.webgl

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.WebGLProgram
import org.scalajs.dom.WebGLUniformLocation
import typingsJapgolly.phaser.spine.ArrayLike
import typingsJapgolly.phaser.spine.Disposable
import typingsJapgolly.phaser.spine.Restorable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shader
  extends StObject
     with Disposable
     with Restorable {
  
  def bind(): Unit
  
  /* private */ var compile: Any
  
  /* private */ var compileProgram: Any
  
  /* private */ var compileShader: Any
  
  /* private */ var context: Any
  
  /* private */ var fragmentShader: Any
  
  /* private */ var fs: Any
  
  /* private */ var fsSource: Any
  
  def getAttributeLocation(attribute: String): Double
  
  def getFragmentShader(): String
  
  def getFragmentSource(): String
  
  def getProgram(): WebGLProgram
  
  def getUniformLocation(uniform: String): WebGLUniformLocation
  
  def getVertexShader(): String
  
  def getVertexShaderSource(): String
  
  /* private */ var program: Any
  
  def setUniform2f(uniform: String, value: Double, value2: Double): Unit
  
  def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit
  
  def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit
  
  def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit
  
  def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit
  
  def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit
  
  def setUniformf(uniform: String, value: Double): Unit
  
  def setUniformi(uniform: String, value: Double): Unit
  
  /* private */ var tmp2x2: Any
  
  /* private */ var tmp3x3: Any
  
  /* private */ var tmp4x4: Any
  
  def unbind(): Unit
  
  /* private */ var vertexShader: Any
  
  /* private */ var vs: Any
  
  /* private */ var vsSource: Any
}
object Shader {
  
  inline def apply(
    bind: Callback,
    compile: Any,
    compileProgram: Any,
    compileShader: Any,
    context: Any,
    dispose: Callback,
    fragmentShader: Any,
    fs: Any,
    fsSource: Any,
    getAttributeLocation: String => Double,
    getFragmentShader: CallbackTo[String],
    getFragmentSource: CallbackTo[String],
    getProgram: CallbackTo[WebGLProgram],
    getUniformLocation: String => WebGLUniformLocation,
    getVertexShader: CallbackTo[String],
    getVertexShaderSource: CallbackTo[String],
    program: Any,
    restore: Callback,
    setUniform2f: (String, Double, Double) => Callback,
    setUniform2x2f: (String, ArrayLike[Double]) => Callback,
    setUniform3f: (String, Double, Double, Double) => Callback,
    setUniform3x3f: (String, ArrayLike[Double]) => Callback,
    setUniform4f: (String, Double, Double, Double, Double) => Callback,
    setUniform4x4f: (String, ArrayLike[Double]) => Callback,
    setUniformf: (String, Double) => Callback,
    setUniformi: (String, Double) => Callback,
    tmp2x2: Any,
    tmp3x3: Any,
    tmp4x4: Any,
    unbind: Callback,
    vertexShader: Any,
    vs: Any,
    vsSource: Any
  ): Shader = {
    val __obj = js.Dynamic.literal(bind = bind.toJsFn, compile = compile.asInstanceOf[js.Any], compileProgram = compileProgram.asInstanceOf[js.Any], compileShader = compileShader.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dispose = dispose.toJsFn, fragmentShader = fragmentShader.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], fsSource = fsSource.asInstanceOf[js.Any], getAttributeLocation = js.Any.fromFunction1(getAttributeLocation), getFragmentShader = getFragmentShader.toJsFn, getFragmentSource = getFragmentSource.toJsFn, getProgram = getProgram.toJsFn, getUniformLocation = js.Any.fromFunction1(getUniformLocation), getVertexShader = getVertexShader.toJsFn, getVertexShaderSource = getVertexShaderSource.toJsFn, program = program.asInstanceOf[js.Any], restore = restore.toJsFn, setUniform2f = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (setUniform2f(t0, t1, t2)).runNow()), setUniform2x2f = js.Any.fromFunction2((t0: String, t1: ArrayLike[Double]) => (setUniform2x2f(t0, t1)).runNow()), setUniform3f = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Double) => (setUniform3f(t0, t1, t2, t3)).runNow()), setUniform3x3f = js.Any.fromFunction2((t0: String, t1: ArrayLike[Double]) => (setUniform3x3f(t0, t1)).runNow()), setUniform4f = js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Double, t4: Double) => (setUniform4f(t0, t1, t2, t3, t4)).runNow()), setUniform4x4f = js.Any.fromFunction2((t0: String, t1: ArrayLike[Double]) => (setUniform4x4f(t0, t1)).runNow()), setUniformf = js.Any.fromFunction2((t0: String, t1: Double) => (setUniformf(t0, t1)).runNow()), setUniformi = js.Any.fromFunction2((t0: String, t1: Double) => (setUniformi(t0, t1)).runNow()), tmp2x2 = tmp2x2.asInstanceOf[js.Any], tmp3x3 = tmp3x3.asInstanceOf[js.Any], tmp4x4 = tmp4x4.asInstanceOf[js.Any], unbind = unbind.toJsFn, vertexShader = vertexShader.asInstanceOf[js.Any], vs = vs.asInstanceOf[js.Any], vsSource = vsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shader]
  }
  
  extension [Self <: Shader](x: Self) {
    
    inline def setBind(value: Callback): Self = StObject.set(x, "bind", value.toJsFn)
    
    inline def setCompile(value: Any): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
    
    inline def setCompileProgram(value: Any): Self = StObject.set(x, "compileProgram", value.asInstanceOf[js.Any])
    
    inline def setCompileShader(value: Any): Self = StObject.set(x, "compileShader", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFragmentShader(value: Any): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsSource(value: Any): Self = StObject.set(x, "fsSource", value.asInstanceOf[js.Any])
    
    inline def setGetAttributeLocation(value: String => Double): Self = StObject.set(x, "getAttributeLocation", js.Any.fromFunction1(value))
    
    inline def setGetFragmentShader(value: CallbackTo[String]): Self = StObject.set(x, "getFragmentShader", value.toJsFn)
    
    inline def setGetFragmentSource(value: CallbackTo[String]): Self = StObject.set(x, "getFragmentSource", value.toJsFn)
    
    inline def setGetProgram(value: CallbackTo[WebGLProgram]): Self = StObject.set(x, "getProgram", value.toJsFn)
    
    inline def setGetUniformLocation(value: String => WebGLUniformLocation): Self = StObject.set(x, "getUniformLocation", js.Any.fromFunction1(value))
    
    inline def setGetVertexShader(value: CallbackTo[String]): Self = StObject.set(x, "getVertexShader", value.toJsFn)
    
    inline def setGetVertexShaderSource(value: CallbackTo[String]): Self = StObject.set(x, "getVertexShaderSource", value.toJsFn)
    
    inline def setProgram(value: Any): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setSetUniform2f(value: (String, Double, Double) => Callback): Self = StObject.set(x, "setUniform2f", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetUniform2x2f(value: (String, ArrayLike[Double]) => Callback): Self = StObject.set(x, "setUniform2x2f", js.Any.fromFunction2((t0: String, t1: ArrayLike[Double]) => (value(t0, t1)).runNow()))
    
    inline def setSetUniform3f(value: (String, Double, Double, Double) => Callback): Self = StObject.set(x, "setUniform3f", js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetUniform3x3f(value: (String, ArrayLike[Double]) => Callback): Self = StObject.set(x, "setUniform3x3f", js.Any.fromFunction2((t0: String, t1: ArrayLike[Double]) => (value(t0, t1)).runNow()))
    
    inline def setSetUniform4f(value: (String, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setUniform4f", js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setSetUniform4x4f(value: (String, ArrayLike[Double]) => Callback): Self = StObject.set(x, "setUniform4x4f", js.Any.fromFunction2((t0: String, t1: ArrayLike[Double]) => (value(t0, t1)).runNow()))
    
    inline def setSetUniformf(value: (String, Double) => Callback): Self = StObject.set(x, "setUniformf", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetUniformi(value: (String, Double) => Callback): Self = StObject.set(x, "setUniformi", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setTmp2x2(value: Any): Self = StObject.set(x, "tmp2x2", value.asInstanceOf[js.Any])
    
    inline def setTmp3x3(value: Any): Self = StObject.set(x, "tmp3x3", value.asInstanceOf[js.Any])
    
    inline def setTmp4x4(value: Any): Self = StObject.set(x, "tmp4x4", value.asInstanceOf[js.Any])
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
    
    inline def setVertexShader(value: Any): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    
    inline def setVs(value: Any): Self = StObject.set(x, "vs", value.asInstanceOf[js.Any])
    
    inline def setVsSource(value: Any): Self = StObject.set(x, "vsSource", value.asInstanceOf[js.Any])
  }
}
