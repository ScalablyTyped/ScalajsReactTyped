package typingsJapgolly.`3dBinPacking`

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bws {
  
  object packer {
    
    trait GAWrapperArray
      extends StObject
         with WrapperArray {
      
      /* private */ def constructResult(): Any
      
      /**
        * @brief Get optimization result.
        *
        * @return result map.
        */
      def getResult(): Any
      
      /* protected */ var instanceArray: InstanceArray
      
      def less(obj: GAWrapperArray): Boolean
      
      /* private */ var price: Any
      
      /* protected */ var result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ Any
      
      /**
        * @brief Validity of this sequence list.
        */
      /* private */ var valid: Any
    }
    object GAWrapperArray {
      
      inline def apply(
        CHILD_TAG: CallbackTo[String],
        TAG: CallbackTo[String],
        constructResult: CallbackTo[Any],
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Wrapper,
        getPrice: CallbackTo[Double],
        getResult: CallbackTo[Any],
        getUtilization: CallbackTo[Double],
        instanceArray: InstanceArray,
        less: GAWrapperArray => Boolean,
        price: Any,
        result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ Any,
        valid: Any
      ): GAWrapperArray = {
        val __obj = js.Dynamic.literal(CHILD_TAG = CHILD_TAG.toJsFn, TAG = TAG.toJsFn, constructResult = constructResult.toJsFn, createChild = js.Any.fromFunction1(createChild), getPrice = getPrice.toJsFn, getResult = getResult.toJsFn, getUtilization = getUtilization.toJsFn, instanceArray = instanceArray.asInstanceOf[js.Any], less = js.Any.fromFunction1(less), price = price.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
        __obj.asInstanceOf[GAWrapperArray]
      }
      
      extension [Self <: GAWrapperArray](x: Self) {
        
        inline def setConstructResult(value: CallbackTo[Any]): Self = StObject.set(x, "constructResult", value.toJsFn)
        
        inline def setGetResult(value: CallbackTo[Any]): Self = StObject.set(x, "getResult", value.toJsFn)
        
        inline def setInstanceArray(value: InstanceArray): Self = StObject.set(x, "instanceArray", value.asInstanceOf[js.Any])
        
        inline def setLess(value: GAWrapperArray => Boolean): Self = StObject.set(x, "less", js.Any.fromFunction1(value))
        
        inline def setPrice(value: Any): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        inline def setResult(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ Any
        ): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        inline def setValid(value: Any): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An interface of physical 3D-instances.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.IEntity * / any */ trait Instance extends StObject {
      
      /**
        * <p> A type, identifier of derived class. </p>
        *
        * <h4> Derived types </h4>
        * <ul>
        *	<li> {@link Product product} </li>
        *	<li> {@link Wrapper wrapper} </li>
        * <ul>
        */
      def TYPE(): String
      
      /**
        * Get height, length on the Y-axis in 3D.
        */
      def getHeight(): Double
      
      /**
        * Get length, length on the Z-axis in 3D.
        */
      def getLength(): Double
      
      /**
        * Get name.
        */
      def getName(): String
      
      /**
        * Get (calculate) volume.
        *
        * @return width x height x length
        */
      def getVolume(): Double
      
      /**
        * Get width, length on the X-axis in 3D.
        */
      def getWidth(): Double
      
      /**
        * Set height, length on the Y-axis in 3D.
        */
      def setHeight(`val`: Double): Unit
      
      /**
        * Set length, length on the Z-axis in 3D.
        */
      def setLength(`val`: Double): Unit
      
      /**
        * Set name.
        */
      def setName(`val`: String): Unit
      
      /**
        * Set width, length on the X-axis in 3D.
        */
      def setWidth(`val`: Double): Unit
    }
    object Instance {
      
      inline def apply(
        TYPE: CallbackTo[String],
        getHeight: CallbackTo[Double],
        getLength: CallbackTo[Double],
        getName: CallbackTo[String],
        getVolume: CallbackTo[Double],
        getWidth: CallbackTo[Double],
        setHeight: Double => Callback,
        setLength: Double => Callback,
        setName: String => Callback,
        setWidth: Double => Callback
      ): Instance = {
        val __obj = js.Dynamic.literal(TYPE = TYPE.toJsFn, getHeight = getHeight.toJsFn, getLength = getLength.toJsFn, getName = getName.toJsFn, getVolume = getVolume.toJsFn, getWidth = getWidth.toJsFn, setHeight = js.Any.fromFunction1((t0: Double) => setHeight(t0).runNow()), setLength = js.Any.fromFunction1((t0: Double) => setLength(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setWidth = js.Any.fromFunction1((t0: Double) => setWidth(t0).runNow()))
        __obj.asInstanceOf[Instance]
      }
      
      extension [Self <: Instance](x: Self) {
        
        inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
        
        inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
        
        inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
        
        inline def setGetVolume(value: CallbackTo[Double]): Self = StObject.set(x, "getVolume", value.toJsFn)
        
        inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
        
        inline def setSetHeight(value: Double => Callback): Self = StObject.set(x, "setHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetLength(value: Double => Callback): Self = StObject.set(x, "setLength", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setSetWidth(value: Double => Callback): Self = StObject.set(x, "setWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setTYPE(value: CallbackTo[String]): Self = StObject.set(x, "TYPE", value.toJsFn)
      }
    }
    
    /**
      * An array of Instance objects.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArray<Instance> * / any */ trait InstanceArray extends StObject {
      
      /**
        * @inheritdoc
        */
      def CHILD_TAG(): String
      
      /**
        * @inheritdoc
        */
      def TAG(): String
      
      /**
        * @inheritdoc
        */
      def createChild(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any
      ): Instance
    }
    object InstanceArray {
      
      inline def apply(
        CHILD_TAG: CallbackTo[String],
        TAG: CallbackTo[String],
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Instance
      ): InstanceArray = {
        val __obj = js.Dynamic.literal(CHILD_TAG = CHILD_TAG.toJsFn, TAG = TAG.toJsFn, createChild = js.Any.fromFunction1(createChild))
        __obj.asInstanceOf[InstanceArray]
      }
      
      extension [Self <: InstanceArray](x: Self) {
        
        inline def setCHILD_TAG(value: CallbackTo[String]): Self = StObject.set(x, "CHILD_TAG", value.toJsFn)
        
        inline def setCreateChild(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Instance
        ): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
      }
    }
    
    /**
      * <p> A repeated Instance. </p>
      *
      * <p> InstanceForm is an utility class for repeated {@link Instance}. It is designed for shrinking
      * volume of network message I/O by storing {@link count repeated count}. </p>
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait InstanceForm extends StObject {
      
      @JSName("$count")
      var $count: String
      
      @JSName("$height")
      var $height: String
      
      @JSName("$length")
      var $length: String
      
      @JSName("$name")
      var $name: String
      
      @JSName("$width")
      var $width: String
      
      /**
        * @inheritdoc
        */
      def TAG(): String
      
      /**
        * @inheritdoc
        */
      def construct(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any
      ): Unit
      
      /**
        * Repeated count of the {@link instance}.
        */
      /* private */ var count: Any
      
      /* private */ def createInstance(xml: Any): Any
      
      def getCount(): Double
      
      def getInstance(): Instance
      
      /**
        * A duplicated Instance.
        */
      /* private */ var instance: Any
      
      def key(): Any
      
      def setCount(`val`: Double): Unit
      
      /**
        * <p> Repeated {@link instance} to {@link InstanceArray}.
        *
        * @details
        * <p> Contains the {@link instance repeated instance} to an {@link InstanceArray} to make
        * {@link instance} to participate in the packing process. The returned {@link InstanceArray} will be
        * registered on {@link Packer.instanceArray}.
        *
        * @return An array of instance containing repeated {@link instance}.
        */
      def toInstanceArray(): InstanceArray
      
      /**
        * @inheritdoc
        */
      def toXML(): Any
    }
    object InstanceForm {
      
      inline def apply(
        $count: String,
        $height: String,
        $length: String,
        $name: String,
        $width: String,
        TAG: CallbackTo[String],
        construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Callback,
        count: Any,
        createInstance: Any => Any,
        getCount: CallbackTo[Double],
        getInstance: CallbackTo[Instance],
        instance: Any,
        key: CallbackTo[Any],
        setCount: Double => Callback,
        toInstanceArray: CallbackTo[InstanceArray],
        toXML: CallbackTo[Any]
      ): InstanceForm = {
        val __obj = js.Dynamic.literal($count = $count.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], TAG = TAG.toJsFn, construct = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any) => construct(t0).runNow()), count = count.asInstanceOf[js.Any], createInstance = js.Any.fromFunction1(createInstance), getCount = getCount.toJsFn, getInstance = getInstance.toJsFn, instance = instance.asInstanceOf[js.Any], key = key.toJsFn, setCount = js.Any.fromFunction1((t0: Double) => setCount(t0).runNow()), toInstanceArray = toInstanceArray.toJsFn, toXML = toXML.toJsFn)
        __obj.asInstanceOf[InstanceForm]
      }
      
      extension [Self <: InstanceForm](x: Self) {
        
        inline def set$count(value: String): Self = StObject.set(x, "$count", value.asInstanceOf[js.Any])
        
        inline def set$height(value: String): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
        
        inline def set$length(value: String): Self = StObject.set(x, "$length", value.asInstanceOf[js.Any])
        
        inline def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
        
        inline def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
        
        inline def setConstruct(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Callback
        ): Self = StObject.set(x, "construct", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any) => value(t0).runNow()))
        
        inline def setCount(value: Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCreateInstance(value: Any => Any): Self = StObject.set(x, "createInstance", js.Any.fromFunction1(value))
        
        inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
        
        inline def setGetInstance(value: CallbackTo[Instance]): Self = StObject.set(x, "getInstance", value.toJsFn)
        
        inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        inline def setKey(value: CallbackTo[Any]): Self = StObject.set(x, "key", value.toJsFn)
        
        inline def setSetCount(value: Double => Callback): Self = StObject.set(x, "setCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
        
        inline def setToInstanceArray(value: CallbackTo[InstanceArray]): Self = StObject.set(x, "toInstanceArray", value.toJsFn)
        
        inline def setToXML(value: CallbackTo[Any]): Self = StObject.set(x, "toXML", value.toJsFn)
      }
    }
    
    /**
      * An array of {@link InstanceForm} objects.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<InstanceForm> * / any */ trait InstanceFormArray extends StObject {
      
      def CHILD_TAG(): String
      
      def TAG(): String
      
      def createChild(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any
      ): InstanceForm
      
      /**
        * Convert {@link InstanceForm} objects to {@link InstanceArray}.
        *
        * @return An array of instance containing repeated instances in {@link InstanceForm} objects.
        */
      def toInstanceArray(): InstanceArray
    }
    object InstanceFormArray {
      
      inline def apply(
        CHILD_TAG: CallbackTo[String],
        TAG: CallbackTo[String],
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => InstanceForm,
        toInstanceArray: CallbackTo[InstanceArray]
      ): InstanceFormArray = {
        val __obj = js.Dynamic.literal(CHILD_TAG = CHILD_TAG.toJsFn, TAG = TAG.toJsFn, createChild = js.Any.fromFunction1(createChild), toInstanceArray = toInstanceArray.toJsFn)
        __obj.asInstanceOf[InstanceFormArray]
      }
      
      extension [Self <: InstanceFormArray](x: Self) {
        
        inline def setCHILD_TAG(value: CallbackTo[String]): Self = StObject.set(x, "CHILD_TAG", value.toJsFn)
        
        inline def setCreateChild(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => InstanceForm
        ): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
        
        inline def setToInstanceArray(value: CallbackTo[InstanceArray]): Self = StObject.set(x, "toInstanceArray", value.toJsFn)
      }
    }
    
    /**
      * @brief Packer, a solver of 3d bin packing with multiple wrappers.
      *
      * @details
      * <p> Packer is a facade class supporting packing operations in user side. You can solve a packing problem
      * by constructing Packer class with {@link WrapperArray wrappers} and {@link InstanceArray instances} to
      * pack and executing {@link optimize Packer.optimize()} method. </p>
      *
      * <p> In background side, deducting packing solution, those algorithms are used. </p>
      * <ul>
      *	<li> <a href="http://betterwaysystems.github.io/packer/reference/AirForceBinPacking.pdf" target="_blank">
      *		Airforce Bin Packing; 3D pallet packing problem: A human intelligence-based heuristic approach </a>
      *	</li>
      *	<li> Genetic Algorithm </li>
      *	<li> Greedy and Back-tracking algorithm </li>
      * </ul>
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait Packer extends StObject {
      
      /**
        * @inheritdoc
        */
      def TAG(): String
      
      /**
        * @inheritdoc
        */
      def construct(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any
      ): Unit
      
      /**
        * Get instanceArray.
        */
      def getInstanceArray(): InstanceArray
      
      /**
        * Get wrapperArray.
        */
      def getWrapperArray(): WrapperArray
      
      /**
        * @brief Initialize sequence list (gene_array).
        *
        * @details
        * <p> Deducts initial sequence list by such assumption: </p>
        *
        * <ul>
        *	<li> Cost of larger wrapper is less than smaller one, within framework of price per volume unit. </li>
        *	<ul>
        *		<li> Wrapper Larger: (price: $1,000, volume: 100cm^3 -> price per volume unit: $10 / cm^3) </li>
        *		<li> Wrapper Smaller: (price: $700, volume: 50cm^3 -> price per volume unit: $14 / cm^3) </li>
        *		<li> Larger's <u>cost</u> is less than Smaller, within framework of price per volume unit </li>
        *	</ul>
        * </ul>
        *
        * <p> Method {@link initGenes initGenes()} constructs {@link WrapperGroup WrapperGroups} corresponding
        * with the {@link wrapperArray} and allocates {@link instanceArray instances} to a {@link WrapperGroup},
        * has the smallest <u>cost</u> between containbles. </p>
        *
        * <p> After executing packing solution by {@link WrapperGroup.optimize WrapperGroup.optimize()}, trying to
        * {@link repack re-pack} each {@link WrapperGroup} to another type of {@link Wrapper}, deducts the best
        * solution between them. It's the initial sequence list of genetic algorithm. </p>
        *
        * @return Initial sequence list.
        */
      /* protected */ def initGenes(): GAWrapperArray
      
      /**
        * Instances trying to pack into the wrapper.
        */
      /* protected */ var instanceArray: InstanceArray
      
      /**
        * <p> Deduct
        *
        */
      def optimize(): WrapperArray
      
      /**
        * Try to repack each wrappers to another type.
        *
        * @param $wrappers Wrappers to repack.
        * @return Re-packed wrappers.
        */
      /* protected */ def repack($wrappers: WrapperArray): WrapperArray
      
      /**
        * @inheritdoc
        */
      def toXML(): Any
      
      /**
        * Candidate wrappers who can contain instances.
        */
      /* protected */ var wrapperArray: WrapperArray
    }
    object Packer {
      
      inline def apply(
        TAG: CallbackTo[String],
        construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Callback,
        getInstanceArray: CallbackTo[InstanceArray],
        getWrapperArray: CallbackTo[WrapperArray],
        initGenes: CallbackTo[GAWrapperArray],
        instanceArray: InstanceArray,
        optimize: CallbackTo[WrapperArray],
        repack: WrapperArray => WrapperArray,
        toXML: CallbackTo[Any],
        wrapperArray: WrapperArray
      ): Packer = {
        val __obj = js.Dynamic.literal(TAG = TAG.toJsFn, construct = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any) => construct(t0).runNow()), getInstanceArray = getInstanceArray.toJsFn, getWrapperArray = getWrapperArray.toJsFn, initGenes = initGenes.toJsFn, instanceArray = instanceArray.asInstanceOf[js.Any], optimize = optimize.toJsFn, repack = js.Any.fromFunction1(repack), toXML = toXML.toJsFn, wrapperArray = wrapperArray.asInstanceOf[js.Any])
        __obj.asInstanceOf[Packer]
      }
      
      extension [Self <: Packer](x: Self) {
        
        inline def setConstruct(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Callback
        ): Self = StObject.set(x, "construct", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any) => value(t0).runNow()))
        
        inline def setGetInstanceArray(value: CallbackTo[InstanceArray]): Self = StObject.set(x, "getInstanceArray", value.toJsFn)
        
        inline def setGetWrapperArray(value: CallbackTo[WrapperArray]): Self = StObject.set(x, "getWrapperArray", value.toJsFn)
        
        inline def setInitGenes(value: CallbackTo[GAWrapperArray]): Self = StObject.set(x, "initGenes", value.toJsFn)
        
        inline def setInstanceArray(value: InstanceArray): Self = StObject.set(x, "instanceArray", value.asInstanceOf[js.Any])
        
        inline def setOptimize(value: CallbackTo[WrapperArray]): Self = StObject.set(x, "optimize", value.toJsFn)
        
        inline def setRepack(value: WrapperArray => WrapperArray): Self = StObject.set(x, "repack", js.Any.fromFunction1(value))
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
        
        inline def setToXML(value: CallbackTo[Any]): Self = StObject.set(x, "toXML", value.toJsFn)
        
        inline def setWrapperArray(value: WrapperArray): Self = StObject.set(x, "wrapperArray", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait PackerForm extends StObject {
      
      def TAG(): String
      
      def construct(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any
      ): Unit
      
      def getInstanceFormArray(): InstanceFormArray
      
      def getWrapperArray(): WrapperArray
      
      /**
        * Form of Instances to pack.
        */
      /* private */ var instanceFormArray: Any
      
      def optimize(): WrapperArray
      
      def toPacker(): Packer
      
      def toXML(): Any
      
      /**
        * Type of Wrappers to be used.
        */
      /* private */ var wrapperArray: Any
    }
    object PackerForm {
      
      inline def apply(
        TAG: CallbackTo[String],
        construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Callback,
        getInstanceFormArray: CallbackTo[InstanceFormArray],
        getWrapperArray: CallbackTo[WrapperArray],
        instanceFormArray: Any,
        optimize: CallbackTo[WrapperArray],
        toPacker: CallbackTo[Packer],
        toXML: CallbackTo[Any],
        wrapperArray: Any
      ): PackerForm = {
        val __obj = js.Dynamic.literal(TAG = TAG.toJsFn, construct = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any) => construct(t0).runNow()), getInstanceFormArray = getInstanceFormArray.toJsFn, getWrapperArray = getWrapperArray.toJsFn, instanceFormArray = instanceFormArray.asInstanceOf[js.Any], optimize = optimize.toJsFn, toPacker = toPacker.toJsFn, toXML = toXML.toJsFn, wrapperArray = wrapperArray.asInstanceOf[js.Any])
        __obj.asInstanceOf[PackerForm]
      }
      
      extension [Self <: PackerForm](x: Self) {
        
        inline def setConstruct(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Callback
        ): Self = StObject.set(x, "construct", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any) => value(t0).runNow()))
        
        inline def setGetInstanceFormArray(value: CallbackTo[InstanceFormArray]): Self = StObject.set(x, "getInstanceFormArray", value.toJsFn)
        
        inline def setGetWrapperArray(value: CallbackTo[WrapperArray]): Self = StObject.set(x, "getWrapperArray", value.toJsFn)
        
        inline def setInstanceFormArray(value: Any): Self = StObject.set(x, "instanceFormArray", value.asInstanceOf[js.Any])
        
        inline def setOptimize(value: CallbackTo[WrapperArray]): Self = StObject.set(x, "optimize", value.toJsFn)
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
        
        inline def setToPacker(value: CallbackTo[Packer]): Self = StObject.set(x, "toPacker", value.toJsFn)
        
        inline def setToXML(value: CallbackTo[Any]): Self = StObject.set(x, "toXML", value.toJsFn)
        
        inline def setWrapperArray(value: Any): Self = StObject.set(x, "wrapperArray", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A product.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait Product
      extends StObject
         with Instance {
      
      /**
        * @inheritdoc
        */
      def TAG(): String
      
      /**
        * Height of the Product, length on the Y-axis in 3D.
        */
      /* protected */ var height: Double
      
      /**
        * Key of a Product is its name.
        */
      def key(): Any
      
      /**
        * Length of the Product, length on the Z-axis in 3D.
        */
      /* protected */ var length: Double
      
      /**
        * <p> Name, key of the Product. </p>
        *
        * <p> The name must be unique because a name identifies a {@link Product}. </p>
        */
      /* protected */ var name: String
      
      /**
        * @inheritdoc
        */
      def toXML(): Any
      
      /**
        * Width of the Product, length on the X-axis in 3D.
        */
      /* protected */ var width: Double
    }
    object Product {
      
      inline def apply(
        TAG: CallbackTo[String],
        TYPE: CallbackTo[String],
        getHeight: CallbackTo[Double],
        getLength: CallbackTo[Double],
        getName: CallbackTo[String],
        getVolume: CallbackTo[Double],
        getWidth: CallbackTo[Double],
        height: Double,
        key: CallbackTo[Any],
        length: Double,
        name: String,
        setHeight: Double => Callback,
        setLength: Double => Callback,
        setName: String => Callback,
        setWidth: Double => Callback,
        toXML: CallbackTo[Any],
        width: Double
      ): Product = {
        val __obj = js.Dynamic.literal(TAG = TAG.toJsFn, TYPE = TYPE.toJsFn, getHeight = getHeight.toJsFn, getLength = getLength.toJsFn, getName = getName.toJsFn, getVolume = getVolume.toJsFn, getWidth = getWidth.toJsFn, height = height.asInstanceOf[js.Any], key = key.toJsFn, length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setHeight = js.Any.fromFunction1((t0: Double) => setHeight(t0).runNow()), setLength = js.Any.fromFunction1((t0: Double) => setLength(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setWidth = js.Any.fromFunction1((t0: Double) => setWidth(t0).runNow()), toXML = toXML.toJsFn, width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[Product]
      }
      
      extension [Self <: Product](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setKey(value: CallbackTo[Any]): Self = StObject.set(x, "key", value.toJsFn)
        
        inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
        
        inline def setToXML(value: CallbackTo[Any]): Self = StObject.set(x, "toXML", value.toJsFn)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * <p> Wrap represents an act wrap(ping). </p>
      *
      * <p> {@link Wrap} is a class represents an act wrapping an {@link Instance} to an {@link Wrapper}.
      * To represent the relationship, Wrap uses Bridge and Capsular patterns to links and intermediates
      * relationship between Wrapper and Instance. </p>
      *
      * <p> Wrap also helps packing optimization and 3d-visualization with its own members
      * {@link orientation} and position variables {@link x}, {@link y} and {@link z}. </p>
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait Wrap extends StObject {
      
      @JSName("$instanceName")
      val $instanceName: String
      
      @JSName("$layoutScale")
      val $layoutScale: String
      
      @JSName("$position")
      val $position: String
      
      /**
        * @inheritdoc
        */
      def TAG(): String
      
      /**
        * @brief Orientation change is occured in level of the packer.
        *
        * @details orientation Packer's new orientation.
        */
      def changeWrapperOrientation(orientation: Double): Unit
      
      /**
        * @inheritdoc
        */
      def construct(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any
      ): Unit
      
      /**
        * Factory method of wrapped Instance.
        *
        * @param type Type of contained Instance's type.
        */
      /* protected */ def createInstance(`type`: String): Instance
      
      /**
        * @brief Estimate orientation by given size.
        *
        * @param width Width by placement.
        * @param height Height by placement.
        * @param length Length by placement.
        */
      def estimateOrientation(width: Double, height: Double, length: Double): Unit
      
      /**
        * Get instance.
        */
      def getInstance(): Instance
      
      /**
        * Get height.
        */
      def getLayoutHeight(): Double
      
      /**
        * Get width.
        */
      def getLayoutWidth(): Double
      
      /**
        * Get length.
        */
      def getLength(): Double
      
      /**
        * Get orientation.
        */
      def getOrientation(): Double
      
      /**
        * Get volume.
        */
      def getVolume(): Double
      
      /**
        * Get wrapper.
        */
      def getWrapper(): Wrapper
      
      /**
        * Get x.
        */
      def getX(): Double
      
      /**
        * Get y.
        */
      def getY(): Double
      
      /**
        * Get z.
        */
      def getZ(): Double
      
      /**
        * An instance wrapped into the {@link wrapper}.
        */
      /* protected */ var instance: Instance
      
      /**
        * Placement orientation of wrapped {@link instance}.
        */
      /* protected */ var orientation: Double
      
      /**
        * Set orientation.
        *
        * @param orientation Orientation code (1 to 6).
        */
      def setOrientation(orientation: Double): Unit
      
      /**
        * Set position.
        *
        * @param x Coordinate-X of the instance placement in the wrapper.
        * @param y Coordinate-Y of the instance placement in the wrapper.
        * @param z Coordinate-Z of the instance placement in the wrapper.
        */
      def setPosition(x: Double, y: Double, z: Double): Unit
      
      /**
        * @inheritdoc
        */
      def toXML(): Any
      
      /**
        * A wrapper wrapping the {@link instance}.
        */
      /* protected */ var wrapper: Wrapper
      
      /**
        * Coordinate-X of the instance placement in the wrapper.
        */
      /* protected */ var x: Double
      
      /**
        * Coordinate-Y of the instance placement in the wrapper.
        */
      /* protected */ var y: Double
      
      /**
        * Coordinate-Z of the instance placement in the wrapper.
        */
      /* protected */ var z: Double
    }
    object Wrap {
      
      inline def apply(
        $instanceName: String,
        $layoutScale: String,
        $position: String,
        TAG: CallbackTo[String],
        changeWrapperOrientation: Double => Callback,
        construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Callback,
        createInstance: String => Instance,
        estimateOrientation: (Double, Double, Double) => Callback,
        getInstance: CallbackTo[Instance],
        getLayoutHeight: CallbackTo[Double],
        getLayoutWidth: CallbackTo[Double],
        getLength: CallbackTo[Double],
        getOrientation: CallbackTo[Double],
        getVolume: CallbackTo[Double],
        getWrapper: CallbackTo[Wrapper],
        getX: CallbackTo[Double],
        getY: CallbackTo[Double],
        getZ: CallbackTo[Double],
        instance: Instance,
        orientation: Double,
        setOrientation: Double => Callback,
        setPosition: (Double, Double, Double) => Callback,
        toXML: CallbackTo[Any],
        wrapper: Wrapper,
        x: Double,
        y: Double,
        z: Double
      ): Wrap = {
        val __obj = js.Dynamic.literal($instanceName = $instanceName.asInstanceOf[js.Any], $layoutScale = $layoutScale.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any], TAG = TAG.toJsFn, changeWrapperOrientation = js.Any.fromFunction1((t0: Double) => changeWrapperOrientation(t0).runNow()), construct = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any) => construct(t0).runNow()), createInstance = js.Any.fromFunction1(createInstance), estimateOrientation = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (estimateOrientation(t0, t1, t2)).runNow()), getInstance = getInstance.toJsFn, getLayoutHeight = getLayoutHeight.toJsFn, getLayoutWidth = getLayoutWidth.toJsFn, getLength = getLength.toJsFn, getOrientation = getOrientation.toJsFn, getVolume = getVolume.toJsFn, getWrapper = getWrapper.toJsFn, getX = getX.toJsFn, getY = getY.toJsFn, getZ = getZ.toJsFn, instance = instance.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction1((t0: Double) => setOrientation(t0).runNow()), setPosition = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setPosition(t0, t1, t2)).runNow()), toXML = toXML.toJsFn, wrapper = wrapper.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
        __obj.asInstanceOf[Wrap]
      }
      
      extension [Self <: Wrap](x: Self) {
        
        inline def set$instanceName(value: String): Self = StObject.set(x, "$instanceName", value.asInstanceOf[js.Any])
        
        inline def set$layoutScale(value: String): Self = StObject.set(x, "$layoutScale", value.asInstanceOf[js.Any])
        
        inline def set$position(value: String): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
        
        inline def setChangeWrapperOrientation(value: Double => Callback): Self = StObject.set(x, "changeWrapperOrientation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setConstruct(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Callback
        ): Self = StObject.set(x, "construct", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any) => value(t0).runNow()))
        
        inline def setCreateInstance(value: String => Instance): Self = StObject.set(x, "createInstance", js.Any.fromFunction1(value))
        
        inline def setEstimateOrientation(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "estimateOrientation", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
        
        inline def setGetInstance(value: CallbackTo[Instance]): Self = StObject.set(x, "getInstance", value.toJsFn)
        
        inline def setGetLayoutHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getLayoutHeight", value.toJsFn)
        
        inline def setGetLayoutWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getLayoutWidth", value.toJsFn)
        
        inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
        
        inline def setGetOrientation(value: CallbackTo[Double]): Self = StObject.set(x, "getOrientation", value.toJsFn)
        
        inline def setGetVolume(value: CallbackTo[Double]): Self = StObject.set(x, "getVolume", value.toJsFn)
        
        inline def setGetWrapper(value: CallbackTo[Wrapper]): Self = StObject.set(x, "getWrapper", value.toJsFn)
        
        inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
        
        inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "getY", value.toJsFn)
        
        inline def setGetZ(value: CallbackTo[Double]): Self = StObject.set(x, "getZ", value.toJsFn)
        
        inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setSetOrientation(value: Double => Callback): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetPosition(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
        
        inline def setToXML(value: CallbackTo[Any]): Self = StObject.set(x, "toXML", value.toJsFn)
        
        inline def setWrapper(value: Wrapper): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A wrapper wrapping instances.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityDeque<Wrap> * / any */ trait Wrapper
      extends StObject
         with Instance {
      
      @JSName("$height")
      var $height: String
      
      @JSName("$length")
      var $length: String
      
      @JSName("$name")
      var $name: String
      
      @JSName("$price")
      var $price: String
      
      @JSName("$scale")
      val $scale: String
      
      @JSName("$spaceUtilization")
      val $spaceUtilization: String
      
      @JSName("$thickness")
      var $thickness: String
      
      @JSName("$width")
      var $width: String
      
      /**
        * @inheritdoc
        */
      def CHILD_TAG(): String
      
      /**
        * @inheritdoc
        */
      def TAG(): String
      
      /**
        * <p> Wrapper is enough greater? </p>
        *
        * <p> Test whether the Wrapper is enough greater than an Instance to contain. </p>
        *
        * @param instance An Instance to test.
        * @return Enough greater or not.
        */
      def containable(instance: Instance): Boolean
      
      /**
        * @inheritdoc
        */
      def createChild(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any
      ): Wrap
      
      def equals(obj: Wrapper): Boolean
      
      /**
        * <p> Get (calculate) containable height, length on the Y-axis in 3D. </p>
        *
        * <p> Calculates containable height considering the {@link thickness}. </p>
        *
        * @return height - (2 x thickness)
        */
      def getContainableHeight(): Double
      
      /**
        * <p> Get (calculate) containable length, length on the Z-axis in 3D. </p>
        *
        * <p> Calculates containable length considering the {@link thickness}. </p>
        *
        * @return length - (2 x thickness)
        */
      def getContainableLength(): Double
      
      /**
        * <p> Get (calculate) containable volume. </p>
        *
        * <p> Calculates containable volume considering the {@link thickness}. </p>
        *
        * @return volume - {(2 x thickness) ^ 3}
        */
      def getContainableVolume(): Double
      
      /**
        * <p> Get (calculate) containable width, length on the X-axis in 3D. </p>
        *
        * <p> Calculates containable width considering the {@link thickness}. </p>
        *
        * @return width - (2 x thickness)
        */
      def getContainableWidth(): Double
      
      /**
        * Get price.
        */
      def getPrice(): Double
      
      /**
        * Get thickness.
        */
      def getThickness(): Double
      
      /**
        * Get utilization ratio of containable volume.
        *
        * @return utilization ratio.
        */
      def getUtilization(): Double
      
      /**
        * Height of the Wrapper, length on the Y-axis in 3D.
        */
      /* protected */ var height: Double
      
      /**
        * Key of a Wrapper is its name.
        */
      def key(): Any
      
      /**
        * Length of the Wrapper, length on the Z-axis in 3D.
        */
      /* protected */ var length: Double
      
      /**
        * <p> Name, key of the Wrapper. </p>
        *
        * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
        */
      /* protected */ var name: String
      
      /**
        * Price, cost of using an Wrapper.
        */
      /* protected */ var price: Double
      
      /**
        * Set price.
        */
      def setPrice(`val`: Double): Unit
      
      /**
        * Set thickness.
        */
      def setThickness(`val`: Double): Unit
      
      /**
        * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
        *
        * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
        * so finally, it reduces total containable volume (-8 * thickness^3). </p>
        */
      /* protected */ var thickness: Double
      
      /**
        * @inheritdoc
        */
      def toXML(): Any
      
      /**
        * Width of the Wrapper, length on the X-axis in 3D.
        */
      /* protected */ var width: Double
    }
    object Wrapper {
      
      inline def apply(
        $height: String,
        $length: String,
        $name: String,
        $price: String,
        $scale: String,
        $spaceUtilization: String,
        $thickness: String,
        $width: String,
        CHILD_TAG: CallbackTo[String],
        TAG: CallbackTo[String],
        TYPE: CallbackTo[String],
        containable: Instance => Boolean,
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Wrap,
        equals_ : Wrapper => Boolean,
        getContainableHeight: CallbackTo[Double],
        getContainableLength: CallbackTo[Double],
        getContainableVolume: CallbackTo[Double],
        getContainableWidth: CallbackTo[Double],
        getHeight: CallbackTo[Double],
        getLength: CallbackTo[Double],
        getName: CallbackTo[String],
        getPrice: CallbackTo[Double],
        getThickness: CallbackTo[Double],
        getUtilization: CallbackTo[Double],
        getVolume: CallbackTo[Double],
        getWidth: CallbackTo[Double],
        height: Double,
        key: CallbackTo[Any],
        length: Double,
        name: String,
        price: Double,
        setHeight: Double => Callback,
        setLength: Double => Callback,
        setName: String => Callback,
        setPrice: Double => Callback,
        setThickness: Double => Callback,
        setWidth: Double => Callback,
        thickness: Double,
        toXML: CallbackTo[Any],
        width: Double
      ): Wrapper = {
        val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $price = $price.asInstanceOf[js.Any], $scale = $scale.asInstanceOf[js.Any], $spaceUtilization = $spaceUtilization.asInstanceOf[js.Any], $thickness = $thickness.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], CHILD_TAG = CHILD_TAG.toJsFn, TAG = TAG.toJsFn, TYPE = TYPE.toJsFn, containable = js.Any.fromFunction1(containable), createChild = js.Any.fromFunction1(createChild), getContainableHeight = getContainableHeight.toJsFn, getContainableLength = getContainableLength.toJsFn, getContainableVolume = getContainableVolume.toJsFn, getContainableWidth = getContainableWidth.toJsFn, getHeight = getHeight.toJsFn, getLength = getLength.toJsFn, getName = getName.toJsFn, getPrice = getPrice.toJsFn, getThickness = getThickness.toJsFn, getUtilization = getUtilization.toJsFn, getVolume = getVolume.toJsFn, getWidth = getWidth.toJsFn, height = height.asInstanceOf[js.Any], key = key.toJsFn, length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], setHeight = js.Any.fromFunction1((t0: Double) => setHeight(t0).runNow()), setLength = js.Any.fromFunction1((t0: Double) => setLength(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPrice = js.Any.fromFunction1((t0: Double) => setPrice(t0).runNow()), setThickness = js.Any.fromFunction1((t0: Double) => setThickness(t0).runNow()), setWidth = js.Any.fromFunction1((t0: Double) => setWidth(t0).runNow()), thickness = thickness.asInstanceOf[js.Any], toXML = toXML.toJsFn, width = width.asInstanceOf[js.Any])
        __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
        __obj.asInstanceOf[Wrapper]
      }
      
      extension [Self <: Wrapper](x: Self) {
        
        inline def set$height(value: String): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
        
        inline def set$length(value: String): Self = StObject.set(x, "$length", value.asInstanceOf[js.Any])
        
        inline def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
        
        inline def set$price(value: String): Self = StObject.set(x, "$price", value.asInstanceOf[js.Any])
        
        inline def set$scale(value: String): Self = StObject.set(x, "$scale", value.asInstanceOf[js.Any])
        
        inline def set$spaceUtilization(value: String): Self = StObject.set(x, "$spaceUtilization", value.asInstanceOf[js.Any])
        
        inline def set$thickness(value: String): Self = StObject.set(x, "$thickness", value.asInstanceOf[js.Any])
        
        inline def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
        
        inline def setCHILD_TAG(value: CallbackTo[String]): Self = StObject.set(x, "CHILD_TAG", value.toJsFn)
        
        inline def setContainable(value: Instance => Boolean): Self = StObject.set(x, "containable", js.Any.fromFunction1(value))
        
        inline def setCreateChild(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Wrap
        ): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
        
        inline def setEquals_(value: Wrapper => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
        
        inline def setGetContainableHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getContainableHeight", value.toJsFn)
        
        inline def setGetContainableLength(value: CallbackTo[Double]): Self = StObject.set(x, "getContainableLength", value.toJsFn)
        
        inline def setGetContainableVolume(value: CallbackTo[Double]): Self = StObject.set(x, "getContainableVolume", value.toJsFn)
        
        inline def setGetContainableWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getContainableWidth", value.toJsFn)
        
        inline def setGetPrice(value: CallbackTo[Double]): Self = StObject.set(x, "getPrice", value.toJsFn)
        
        inline def setGetThickness(value: CallbackTo[Double]): Self = StObject.set(x, "getThickness", value.toJsFn)
        
        inline def setGetUtilization(value: CallbackTo[Double]): Self = StObject.set(x, "getUtilization", value.toJsFn)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setKey(value: CallbackTo[Any]): Self = StObject.set(x, "key", value.toJsFn)
        
        inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        inline def setSetPrice(value: Double => Callback): Self = StObject.set(x, "setPrice", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setSetThickness(value: Double => Callback): Self = StObject.set(x, "setThickness", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
        
        inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
        
        inline def setToXML(value: CallbackTo[Any]): Self = StObject.set(x, "toXML", value.toJsFn)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<Wrapper> * / any */ trait WrapperArray extends StObject {
      
      /**
        * @inheritdoc
        */
      def CHILD_TAG(): String
      
      /**
        * @inheritdoc
        */
      def TAG(): String
      
      /**
        * @inheritdoc
        */
      def createChild(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any
      ): Wrapper
      
      /**
        * Get (calculate) price.
        */
      def getPrice(): Double
      
      /**
        * Get (calculate) utilization rate.
        */
      def getUtilization(): Double
    }
    object WrapperArray {
      
      inline def apply(
        CHILD_TAG: CallbackTo[String],
        TAG: CallbackTo[String],
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Wrapper,
        getPrice: CallbackTo[Double],
        getUtilization: CallbackTo[Double]
      ): WrapperArray = {
        val __obj = js.Dynamic.literal(CHILD_TAG = CHILD_TAG.toJsFn, TAG = TAG.toJsFn, createChild = js.Any.fromFunction1(createChild), getPrice = getPrice.toJsFn, getUtilization = getUtilization.toJsFn)
        __obj.asInstanceOf[WrapperArray]
      }
      
      extension [Self <: WrapperArray](x: Self) {
        
        inline def setCHILD_TAG(value: CallbackTo[String]): Self = StObject.set(x, "CHILD_TAG", value.toJsFn)
        
        inline def setCreateChild(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ Any => Wrapper
        ): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
        
        inline def setGetPrice(value: CallbackTo[Double]): Self = StObject.set(x, "getPrice", value.toJsFn)
        
        inline def setGetUtilization(value: CallbackTo[Double]): Self = StObject.set(x, "getUtilization", value.toJsFn)
        
        inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
      }
    }
    
    /**
      * A group of {@link Wrapper Wrappers} with same type.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    trait WrapperGroup
      extends StObject
         with WrapperArray {
      
      /**
        * <p> Allocate instance(s) to the WrapperGroup. </p>
        *
        * <p> Inspect the instance is enough small to be wrapped into an empty wrapper. If the instance
        * is enough small, registers the instance (or repeated instances) to the {@link reserveds} and
        * returns <code>true</code>. If the instance is too large to be capsuled, returns <code>false</code>. </p>
        *
        * <h4>Note</h4>
        * <p> The word <u>the instance is enough small to be wrapped into the empty wrapper</u> means
        * the instance can be contained into an empty, a new wrapper contaning nothing literally. </p>
        *
        * <p> In the method allocate(), it doesn't consider how many instances are wrapped into ordinary
        * wrapper and how much volumes are consumed.  </p>
        *
        * @param instance An Instance to allocate.
        * @param n Repeating number of the <i>instance</i>.
        *
        * @return Whether the instance is enough small to be wrapped into a (new) wrapper
        *		   of same type with the sample.
        */
      def allocate(instance: Instance): Boolean = js.native
      def allocate(instance: Instance, n: Double): Boolean = js.native
      
      /**
        * Allocated instances.
        */
      /* protected */ var allocatedInstanceArray: InstanceArray = js.native
      
      /**
        * Get allocated instances.
        */
      def getAllocatedInstanceArray(): InstanceArray = js.native
      
      /**
        * Get sample.
        */
      def getSample(): Wrapper = js.native
      
      /**
        * Key of a WrapperGroup is dependent on its sample.
        */
      def key(): Any = js.native
      
      /**
        * <p> Run optimization in level of the group. </p>
        *
        * <p> The optimization routine begins by creating a {@link Wrapper} like the {@link sample}. Then
        * try to pack {@link allocatedInstanceArray allocated instances} to the {@link Wrapper} as a lot as
        * possible. If there're some {@link Wrappers} can't be packed by overloading, then create a new
        * {@link Wrapper} again and try to pack {@link allocatedInstanceArray instances} again, too. </p>
        *
        * <p> Repeats those steps until all {@link alloctedInstanceArray instances} are {@link Wrap packed}
        * so that there's not any {@link Instance instance} left. </p>
        *
        * <h4> Warning </h4>
        * <p> When call this {@link optimize optimize()} method, ordinary children {@link Wrapper} objects
        * in the {@link WrapperGroup} will be substituted with the newly optimized {@link Wrapper} objects. </p>
        */
      def optimize(): Unit = js.native
      
      /**
        * <p> Wrap allocated instances into <b>a new</b> {@link Wrapper}. </p>
        *
        * <p> {@link Wrap Wraps} instances to a new Wrapper which is copied from the sample. </p>
        * <p> After the wrapping is done, the new {@link Wrapper} is registered to the {@link WrapperGroup}
        * as a child and instances failed to wrap by overloading is returned. </p>
        *
        * @param instanceArray instances to {@link Wrap wrap} into <b>a new</b> {@link Wrapper}.
        *
        * @return Instances failed to {@link Wrap wrap} by overloading.
        * @see boxologic
        */
      /* private */ def pack(instanceArray: Any): Any = js.native
      
      /**
        * <p> A sample, standard of the WrapperGroup. </p>
        *
        * <p> The sample represents what type of Wrappers are grouped into the WrapperGroup. </p>
        */
      /* protected */ var sample: Wrapper = js.native
    }
  }
}
